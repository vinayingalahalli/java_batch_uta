package com.bo.impl;

import com.bo.UserBO;
import com.dao.impl.UserDaoImpl;
import com.exception.BusinessException;
import com.to.User;

public class UserBoImpl implements UserBO{

	@Override
	public boolean isValidUser(User user) throws BusinessException {
		boolean b=false;
		if(user!=null && (user.getUsername()+"").matches("[0-9]{6}") && user.getPassword().matches("[a-z]{3,6}@[0-9]{4,6}")) {
			//call DAO
			b=new UserDaoImpl().isValidUser(user);
		}else {
			throw new BusinessException("Invalid Logon Credentials");
		}
		return b;
	}

}
