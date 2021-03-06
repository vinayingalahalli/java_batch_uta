package com.search.team.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbutil.OracleConnection;
import com.search.exception.BusinessException;
import com.search.team.dao.TeamDAO;
import com.search.to.Team;

public class TeamDaoImpl implements TeamDAO{

	@Override
	public List<Team> getAllTeams() throws BusinessException {
		List<Team> teamList=new ArrayList<>();
		try(Connection connection=OracleConnection.getConnection()){
			String sql="Select tid,tname from team";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team=new Team(resultSet.getInt("tid"), resultSet.getString("tname"));
				teamList.add(team);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error "+e);
		}
		return teamList;
		
	}

}
