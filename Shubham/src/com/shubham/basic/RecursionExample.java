package com.shubham.basic;

/*
 * A simple program for recurion
 */

public class RecursionExample {
	public static void main(String[] args) {
		int i = 1;
		print(i);
	}

	private static void print(int i) {//Recursion
		if(i == 11)
			return;
		System.out.print(i+" ");
		i++;
		print(i);
	}
	
	
}
