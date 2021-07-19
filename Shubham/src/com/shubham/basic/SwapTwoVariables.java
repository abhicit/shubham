package com.shubham.basic;

public class SwapTwoVariables {
	int x = 0, y = 0;
	public static void main(String[] args) {
		SwapTwoVariables swap = new SwapTwoVariables();
		swap.swap(10, 20);
		System.out.println(swap.x+" "+swap.y);
	}
	
	public void swap(int a, int b) {//a = 10, b = 20
		b = b + a;//b = 30
		a = b - a;//a = 20
		b = b - a;//b = 10
		this.x = a;
		this.y = b;
	}
}
