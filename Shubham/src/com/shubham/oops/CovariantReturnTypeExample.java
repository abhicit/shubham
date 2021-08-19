package com.shubham.oops;

class A2{
	public A2 get(){
		return this;
	}
}

class B2 extends A2{
	public A2 get() {
		return this;
	}
	
	public void display() {
		System.out.println("My name is Shubham");
	}
}

public class CovariantReturnTypeExample {
	public static void main(String[] args) {
		((B2) new B2().get()).display();
	}
}
