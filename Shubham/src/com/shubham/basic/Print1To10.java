package com.shubham.basic;

public class Print1To10 {
	public static void main(String[] args) {
		for(int i = 2; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i+"X"+j+" = "+i*j);
			}
			
			System.out.println();
		}
	}
}
