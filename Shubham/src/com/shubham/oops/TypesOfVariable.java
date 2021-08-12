package com.shubham.oops;
/*
 * 1. Local Variable
 * 2. Instance Variable
 * 3. Static Variable
 */
public class TypesOfVariable {
	String instVar = "Instance Variable";
	static String staticVar = "Static Variable";
	public void print(String localVariable) {
		System.out.println(localVariable);
	}
	
	public static void main(String[] args) {
		System.out.println(staticVar);
		//To access instance member, 
		//we need to create object of that class
		TypesOfVariable obj = new TypesOfVariable();
		System.out.println(obj.instVar);
		obj.print("Local Variable");
	}
}
