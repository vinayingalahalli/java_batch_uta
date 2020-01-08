package com.college.bo.impl;

import java.util.List;

import com.college.bo.CollegeBO;
import com.college.dao.CollegeDAO;
import com.college.dao.impl.CollegeDaoImpl;
import com.college.exception.BusinessException;
import com.college.to.College;

public class CollegeBoImpl implements CollegeBO
{
private CollegeDAO collegedao=new CollegeDaoImpl();
	@Override
	public College addCollege(College college) throws BusinessException {
		// TODO Auto-generated method stub
		return collegedao.addCollege(college);
	}

	@Override
	public College updateCollege(College college) throws BusinessException {
		// TODO Auto-generated method stub
		return collegedao.updateCollege(college);
	}

	@Override
	public College getCollegeById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return collegedao.getCollegeById(id);
	}

	@Override
	public List<College> getCollegeList() throws BusinessException {
		// TODO Auto-generated method stub
		return collegedao.getCollegeList();
	}

	@Override
	public void deleteCollege(int id) throws BusinessException {
		// TODO Auto-generated method stub
		collegedao.deleteCollege(id);
	}

}
