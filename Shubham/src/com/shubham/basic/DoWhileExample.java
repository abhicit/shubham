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
		//print 1 to 10
		int i = 1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i <= 10);
	}
}
