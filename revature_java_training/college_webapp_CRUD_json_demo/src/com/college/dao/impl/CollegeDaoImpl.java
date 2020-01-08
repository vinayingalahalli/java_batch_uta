package com.college.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.college.dao.CollegeDAO;
import com.college.exception.BusinessException;
import com.college.to.College;
import com.dbutil.OracleConnection;

public class CollegeDaoImpl implements CollegeDAO {

	@Override
	public College addCollege(College college) throws BusinessException {
		try (Connection connection = OracleConnection.getConnection()) {
			String sql="{call addCollege(?,?,?,?)}";
			CallableStatement callableStatement=connection.prepareCall(sql);
			callableStatement.registerOutParameter(1, java.sql.Types.NUMERIC);
			callableStatement.setString(2, college.getName());
			callableStatement.setString(3, college.getAddress());
			callableStatement.setLong(4, college.getContact());
			callableStatement.execute();
			college.setId(callableStatement.getInt(1));
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error "+e.getMessage());
		}
		return college;
	}

	@Override
	public College updateCollege(College college) throws BusinessException {
		try (Connection connection = OracleConnection.getConnection()) {
			String sql= "update college set contact=? where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setLong(1, college.getContact());
			preparedStatement.setInt(2, college.getId());
			preparedStatement.execute();
			college=getCollegeById(college.getId());
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error "+e.getMessage());
		}
		return college;
	}

	@Override
	public College getCollegeById(int id) throws BusinessException {
		College college=null;
		try (Connection connection = OracleConnection.getConnection()) {
			String sql="Select name,address,contact from college where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				college=new College();
				college.setId(id);
				college.setName(resultSet.getString("name"));
				college.setAddress(resultSet.getString("address"));
				college.setContact(resultSet.getLong("contact"));
			}else {
				throw new BusinessException("College with id "+id+" not found");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error "+e.getMessage());
		}
		return college;
	}

	@Override
	public List<College> getCollegeList() throws BusinessException {
		List<College> collegeList=new ArrayList<>();
		try (Connection connection = OracleConnection.getConnection()) {
			String sql="Select id,name,address,contact from college";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				College college=new College();
				college.setId(resultSet.getInt("id"));
				college.setName(resultSet.getString("name"));
				college.setAddress(resultSet.getString("address"));
				college.setContact(resultSet.getLong("contact"));
				collegeList.add(college);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error "+e.getMessage());
		}
		return collegeList;
	}

	@Override
	public void deleteCollege(int id) throws BusinessException {
		try (Connection connection = OracleConnection.getConnection()) {
			String sql="delete from college where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error "+e.getMessage());
		}

	}

}
