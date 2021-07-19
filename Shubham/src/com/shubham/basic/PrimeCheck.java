package com.shubham.basic;

/*
 * 20 = 2, 4, 5, 10, 20, n = 20 (2, 10), (4, 5)
 * 50 = 2, 5, 10, 25, 50, n = 50 (2, 25), (5, 10) 
 */

public class PrimeCheck {
	public static void main(String[] args) {
		System.out.println(isPrime(2));
	}
	
	public static boolean isPrime(int num) {
		if(num == 0 || num == 1)
			return false;
		
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
