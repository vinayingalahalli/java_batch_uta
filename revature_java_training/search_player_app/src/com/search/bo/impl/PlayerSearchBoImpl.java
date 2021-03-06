package com.search.bo.impl;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.search.bo.PlayerSearchBO;
import com.search.dao.PlayerSearchDAO;
import com.search.dao.impl.PlayerSearchDaoImpl;
import com.search.exception.BusinessException;
import com.search.to.Player;

public class PlayerSearchBoImpl implements PlayerSearchBO {
	private PlayerSearchDAO dao;

	@Override
	public Player getPlayerById(String id) throws BusinessException {
		Player player = null;
		if (id.matches("PL[A-Z]{2}[0-9]{6}")) {
			// code here for DAO
			player = getDao().getPlayerById(id);
		} else {
			throw new BusinessException("Entered PlayerID " + id + " is invalid");
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		List<Player> playerList = null;

		if (dob.matches("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}")) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			sdf.setLenient(false);
			try {
				Date dobDate = sdf.parse(dob);
				// code here for DAO
				playerList=getDao().getPlayersByDob(dobDate);
			} catch (ParseException e) {
				throw new BusinessException("Entered date " + dob + " is invalid");
			}
		} else {
			throw new BusinessException("Entered date " + dob + " should be in (dd.MM.yyyy) format only");
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
		List<Player> playerList=null;
		playerList=getDao().getPlayersByTeamName(teamName);
		return playerList;
	}

	public PlayerSearchDAO getDao() {
		if (dao == null) {
			dao = new PlayerSearchDaoImpl();
		}
		return dao;
	}

}
