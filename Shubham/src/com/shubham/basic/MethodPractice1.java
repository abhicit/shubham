package com.shubham.basic;

public class MethodPractice1 { 
	public 		static 		void 		main  			(String[] args) {
	/*AcMo*/ /*st/non st*/ /*ret type*//*method name*/  /*parameter list*/
		
		//this is method body
		System.out.println("Inside main() method");
		show();
		System.out.println("After show() method call");
	}
	
	public static void display() {
		System.out.println("Inside display() method");
	}
	
	public static void print() {
		System.out.println("Inside print() method");
		display();
		System.out.println("After display() method call");
	}
	
	public static void show() {
		System.out.println("Inside show() method");
		print();
		System.out.println("After print() method call");
	}
}
