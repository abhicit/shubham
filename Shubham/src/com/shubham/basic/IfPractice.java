package com.shubham.basic;

/*
 * if(condition){
 * 		statements
 * }
 */

public class IfPractice {
	public static void main(String[] args) {
		int age = 20;
		print(age);
	}
	
	public static void print(int age) {
		if(age >= 18) {
			System.out.println("Person is adult");
		}
	}
}
