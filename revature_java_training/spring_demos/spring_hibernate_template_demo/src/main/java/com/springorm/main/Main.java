package com.springorm.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.PersonDAO;
import com.springorm.pojo.Person;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("ormbeans.xml");
		PersonDAO dao=(PersonDAO) context.getBean("dao");
//		Person p=dao.createPerson(new Person("Vinay", "India"));
//		System.out.println(p);
//		Person p1=dao.createPerson(new Person("Kumar", "India"));
//		System.out.println(p1);
//		Person p2=dao.createPerson(new Person("Pavan", "USA"));
//		System.out.println(p2);
//		Person p3=dao.createPerson(new Person("Sam", "Australia"));
//		System.out.println(p3);
//		Person p4=dao.createPerson(new Person("Raj", "UK"));
//		System.out.println(p4);
		
		System.out.println(dao.getPersonList());

	}

}
