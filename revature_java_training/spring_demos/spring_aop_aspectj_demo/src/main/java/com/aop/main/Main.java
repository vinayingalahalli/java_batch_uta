package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.bo.SomeBO;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("aopbeans.xml");
		SomeBO bo=(SomeBO) context.getBean("bo");
		bo.validate();
		bo.validateAgain();

	}

}
