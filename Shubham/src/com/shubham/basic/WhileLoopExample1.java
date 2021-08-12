package com.shubham.basic;

public class WhileLoopExample1 {
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {//break
		int i = 1;
		while(true) {
			System.out.print(i+" ");
			if(i == 10)
				break;
			i++;
		}
	}
}
