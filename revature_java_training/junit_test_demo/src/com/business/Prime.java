package com.business;

public class Prime {

	public boolean isPrime(int n) {
		boolean b = false;
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		return b;

	}
}
