package com.dao;

import com.exception.BusinessException;
import com.to.User;

public interface UserDAO {
	public boolean isValidUser(User user) throws BusinessException;

}
