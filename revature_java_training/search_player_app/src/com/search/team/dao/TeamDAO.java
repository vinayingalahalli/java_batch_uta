package com.search.team.dao;

import java.util.List;

import com.search.exception.BusinessException;
import com.search.to.Team;

public interface TeamDAO {
	public List<Team> getAllTeams() throws BusinessException;
}
