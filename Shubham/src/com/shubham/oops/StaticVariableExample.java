package com.shubham.oops;

public class StaticVariableExample {
	static int count;
	int counter = 1;
	
	static {
		count = 1;
	}
	
	public static void main(String[] args) {
		StaticVariableExample obj = new StaticVariableExample();
		System.out.println(++obj.counter);//2
		System.out.println(++obj.counter);//3
		StaticVariableExample obj1 = new StaticVariableExample();
		System.out.println(++obj1.counter);//2
		
		System.out.println(++count);//2
		System.out.println(++count);//3
	}
}
