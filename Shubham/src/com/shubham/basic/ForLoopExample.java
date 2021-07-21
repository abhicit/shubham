package com.shubham.basic;

public class ForLoopExample {
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		int num = 2;
		for(int i = 0; i < 10; i++){
			//System.out.print(Math.pow(2, i)+" "); Using library function
			//System.out.print((2<<i)+" "); Using right shift
			System.out.print(num+" ");
			num *= 2;// num = num * 2;
		}
	}
}
