package com.shubham.oops;

class Shapes{
	
	String name = "Shape";
	
	Shapes(){
		System.out.println("This is shapes class");
	}
	
	public void printName() {
		System.out.println(name);
	}
}

class Circle extends Shapes{
	
	String name = "Circle";//variable overriding
	
	Circle(){
		super();//super class constructor call
		System.out.println("This is circle class");
	}
	
	public void printName() {//method overriding
		System.out.println(super.name);//super class variable call
		System.out.println(name);
		super.printName();//super class method call
	}
}

public class SuperKeywordExample {
	public static void main(String[] args) {
		Shapes obj = new Circle();
		obj.printName();
		
	}
}
