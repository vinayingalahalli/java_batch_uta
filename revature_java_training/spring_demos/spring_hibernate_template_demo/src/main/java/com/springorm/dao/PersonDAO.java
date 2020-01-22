package com.springorm.dao;

import java.util.List;

import com.springorm.pojo.Person;

public interface PersonDAO {

	public Person createPerson(Person person);
	
	public List<Person> getPersonList();
}
