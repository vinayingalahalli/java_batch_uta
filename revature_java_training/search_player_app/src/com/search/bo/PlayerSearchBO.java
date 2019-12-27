package com.search.bo;

import java.util.List;

import com.search.exception.BusinessException;
import com.search.to.Player;

public interface PlayerSearchBO {

	public Player getPlayerById(String id) throws BusinessException;
	public List<Player> getPlayersByName(String name) throws BusinessException;
	public List<Player> getPlayersByDob(String dob) throws BusinessException;
	public List<Player> getPlayersByGender(String gender) throws BusinessException;
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException;
}
