package com.shubham.basic;
//accessModifier static/non static returnType methodName(Datatype variableName){
//}
public class MethodPractice {
	public static void main(String[] args) {
		String name = "Shubham";
		int age = 25;
		char gender = 'M';
		printName(name, age, gender);
		print();
	}
	
	public static void print() {
		System.out.println("Hello world!");
	}
	
	public static void printName(String str, int age, char gender) {
		System.out.println(str+" "+age+" "+gender);
	}
}
