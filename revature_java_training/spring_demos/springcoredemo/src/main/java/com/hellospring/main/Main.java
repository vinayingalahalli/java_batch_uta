package com.hellospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hellospring.pojo.Hello;
import com.hellospring.pojo.Person;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//	Hello h=context.getBean(com.hellospring.pojo.Hello.class);
//	Hello h=(Hello) context.getBean("h1");
//	System.out.println(h.getMessage());
//	
//	Hello h2=(Hello) context.getBean("h2");
//	System.out.println(h2.getMessage());
	
	Person p1=(Person)context.getBean("p1");
	System.out.println(p1);
	
	Person p2=(Person)context.getBean("p2");
	System.out.println(p2);
	
	
}
}
