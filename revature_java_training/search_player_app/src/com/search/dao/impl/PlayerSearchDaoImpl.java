package com.search.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dbutil.OracleConnection;
import com.search.dao.PlayerSearchDAO;
import com.search.exception.BusinessException;
import com.search.to.Player;
import com.search.to.Team;

public class PlayerSearchDaoImpl implements PlayerSearchDAO{

	@Override
	public Player getPlayerById(String id) throws BusinessException {
		Player player=null;
		try(Connection connection=OracleConnection.getConnection()){
			String sql="select p.name,p.dob,p.city,p.gender,p.tid,t.tname from "
					+ "player p join team t on p.tid=t.tid where p.id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				player=new Player();
				player.setId(id);
				player.setName(resultSet.getString("name"));
				player.setCity(resultSet.getString("city"));
				player.setDob(resultSet.getDate("dob"));
				player.setGender(resultSet.getString("gender"));
				player.setTeam(new Team(resultSet.getInt("tid"), resultSet.getString("tname")));
			}else {
				throw new BusinessException("Player with Id "+id+" not found...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured..please contact support..."+e);
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByDob(Date dob) throws BusinessException {
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=OracleConnection.getConnection()){
			String sql="select p.id,p.name,p.city,p.gender,p.tid,t.tname from "
					+ "player p join team t on p.tid=t.tid where p.dob=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setDate(1, new java.sql.Date(dob.getTime()));
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getString("id"));
				player.setName(resultSet.getString("name"));
				player.setCity(resultSet.getString("city"));
				player.setDob(dob);
				player.setGender(resultSet.getString("gender"));
				player.setTeam(new Team(resultSet.getInt("tid"), resultSet.getString("tname")));
				playerList.add(player);
			}
			if(playerList.size()==0)
			{
				throw new BusinessException("Player with DOB "+new SimpleDateFormat("dd.MM.yyyy").format(dob)+" not found...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured..please contact support..."+e);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=OracleConnection.getConnection()){
			String sql="select p.id,p.name,p.city,p.dob,p.gender,p.tid from "
					+ "player p join team t on p.tid=t.tid where t.tname=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, teamName);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getString("id"));
				player.setName(resultSet.getString("name"));
				player.setCity(resultSet.getString("city"));
				player.setDob(resultSet.getDate("dob"));
				player.setGender(resultSet.getString("gender"));
				player.setTeam(new Team(resultSet.getInt("tid"), teamName));
				playerList.add(player);
			}
			if(playerList.size()==0)
			{
				throw new BusinessException("No Players yet in Team - "+teamName);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured..please contact support..."+e);
		}
		return playerList;
	}

}
