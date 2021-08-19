package com.shubham.oops;

class Parent{
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
}

class Child extends Parent{
	@Override
	public void sum(int c, int d) {
		System.out.println(c+d);
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.sum(1,2);
	}
}
