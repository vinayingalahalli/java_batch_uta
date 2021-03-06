package com.springorm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.springorm.pojo.Person;

public class PersonDaoImpl implements PersonDAO{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Person createPerson(Person person) {
		Session session=this.sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(person);
		transaction.commit();
		session.close();
		return person;
	}

	public List<Person> getPersonList() {
		Session session=this.sessionFactory.openSession();
		List<Person> personList=session.createQuery("from com.springorm.pojo.Person").list();
		session.close();
		return personList;
	}

	
	

}
