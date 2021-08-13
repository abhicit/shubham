package com.shubham.oops;

/*
 * class A --> class B
 */
//Single Inheritance
class A{//Parent class or super class
	int a = 10;
	public void print() {
		System.out.println("I am class A");
	}
}

class B extends A{//Child Class or Sub Class
	public void print() {
		System.out.println("I am class B");
	}
}

public class SingleInheritanceExample {
	public static void main(String[] args) {
		A objA = new B();
		objA.print();
		System.out.println(objA.a);
	}
}
