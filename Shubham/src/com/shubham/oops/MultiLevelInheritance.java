package com.shubham.oops;

/*
 * class A -> class B -> class C
 */

class A1{
	public void print() {
		System.out.println("I am class A");
	}
}

class B1 extends A1{
	public void print() {
		System.out.println("I am class B");
	}
}

class C extends B1{
	public void print() {
		System.out.println("I am class C");
	}
}

class D{
	public void print() {
		System.out.println("I am class D");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		A1 obj = new C();
		obj.print();
	}
}
