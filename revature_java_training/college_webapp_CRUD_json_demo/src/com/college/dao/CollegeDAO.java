package com.college.dao;

import java.util.List;

import com.college.exception.BusinessException;
import com.college.to.College;

public interface CollegeDAO {
	public College addCollege(College college) throws BusinessException;
	public College updateCollege(College college) throws BusinessException;
	public College getCollegeById(int id) throws BusinessException;
	public List<College> getCollegeList() throws BusinessException;
	public void deleteCollege(int id) throws BusinessException;
}
