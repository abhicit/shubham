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
		
		//print 1 to 10
		int i = 10;
		while(i >= 1) {
			System.out.print(i+" ");
			i--;
		}
	}
}
