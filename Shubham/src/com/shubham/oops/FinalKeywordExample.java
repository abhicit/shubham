package com.shubham.oops;

final class Vehicle{//final class cannot be inherited
	public void print() {
		System.out.println("This is vehical class");
	}
}

class FourWheeler{
	public final void print() {//final method cannot be overridden
		System.out.println("This is FourWheeler final method");
	}
}

class Car extends FourWheeler{
	public void print1() {
		System.out.println("This is car class");
	}
}

public class FinalKeywordExample {
	final static String name = "Shubham";//final field cannot be changed
	public static void main(String[] args) {
		//print anything
	}
}
