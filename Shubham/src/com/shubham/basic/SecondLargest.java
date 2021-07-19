package com.shubham.basic;

public class SecondLargest {
	public static void main(String[] args) {
		System.out.println(secondLargest(90, 20, 89));
	}
	
	public static int secondLargest(int a, int b, int c) {
		if(a >= b && b >= c && a >= c)
			return b;
		else if(b >= a && a >= c && b >= c)
			return a;
		else
			return c;
	}
}
