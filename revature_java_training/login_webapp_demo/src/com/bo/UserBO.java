package com.bo;

import com.exception.BusinessException;
import com.to.User;

public interface UserBO {
public boolean isValidUser(User user) throws BusinessException;

}
