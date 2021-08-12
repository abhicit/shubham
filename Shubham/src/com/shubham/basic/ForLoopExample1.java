package com.shubham.basic;

public class ForLoopExample1 {
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {//continue example
		for(int i = 1; i <= 10; i++) {
			if(i == 5 || i == 7) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
