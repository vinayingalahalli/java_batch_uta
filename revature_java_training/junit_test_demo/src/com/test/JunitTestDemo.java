package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTestDemo {

	@BeforeClass
	public static void onceExecutedBeforeAny() {
		System.out.println("Before class");
	}
	
	@Before
	public void executedBeforeAnyMethod() {
		System.out.println("Before every method of the class");
	}
	
	@AfterClass
	public static void afterTheClass() {
		System.out.println("Executed after the class");
	}
	
	@After
	public void afterEachMethod() {
		System.out.println("After each method of class");
	}
	@Test
	public void testHello() {
		String s="hello";
		assertEquals("hello", s);
	}
	@Test
	public void testSum() {
		int res=6+7;
		assertEquals(13, res);
	}
	@Ignore
	public void iAmIgnored() {
		System.out.println("I am ignored");
	}
	
}
