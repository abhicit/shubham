package com.shubham.basic;

public class MethodPracticeWithReturnType {
	public static void main(String[] args) {
		String firstName = "Shubham";
		String lastName = "Jha";
		String fullName = getName(firstName, lastName);
		System.out.println(fullName);
	}
	
	public static String getName(String firstName, String lastName) {//Shubham Jha
		String fullName = firstName+" "+lastName;
		return fullName;
	}
}
