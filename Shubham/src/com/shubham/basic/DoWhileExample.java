package com.shubham.basic;

public class DoWhileExample {
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		/*
		 * initialization
		 * do{
		 * statements;
		 * increment/decrement;
		 * }while(condition);
		 */
		
		int i = 10;
		do {
			System.out.print(i+" ");
			i--;
		}while(i >= 1);
	}
}
