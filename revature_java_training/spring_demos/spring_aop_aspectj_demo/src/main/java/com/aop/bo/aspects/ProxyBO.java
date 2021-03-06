package com.aop.bo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProxyBO {

	@Pointcut("execution(* com.aop.bo.SomeBO.validate*(..))")
	public void someBO(){}
	
	
	@After("someBO()")
	public void afterAdvice(JoinPoint jp) {
		System.out.println("After execution of "+jp.getSignature());
	}
	
	@Before("someBO()")
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("Before execution of "+jp.getSignature());
	}
	
	//Around -> PJP
	//Throwing advice -> @AfterThrowing
}
