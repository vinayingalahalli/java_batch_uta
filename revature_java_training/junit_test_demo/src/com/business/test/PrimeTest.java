package com.business.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.business.Prime;

class PrimeTest {

	private static Prime prime;
	@BeforeAll
	public static void initializePrime() {
		prime=new Prime();
		System.out.println("Called");
	}
	@Test
	void testIsPrime() {
		assertEquals(true, prime.isPrime(2));
	}

}
