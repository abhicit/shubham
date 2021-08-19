package com.shubham.oops;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
	}
	
	public static int sum(int a, int b) {//method overloading
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
}
