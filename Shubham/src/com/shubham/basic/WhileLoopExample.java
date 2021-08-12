package com.shubham.basic;

public class WhileLoopExample {
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		/* initialization
		 * while(condition){ //if condition is true
		 * 		run statements;
		 * 		increment/decrement
		 * }
		 */
		
		//print 10 to 1
		int i = 10;
		while(i >= 1) {
			System.out.println(i);
			i = i-2;
		}
	}
}
