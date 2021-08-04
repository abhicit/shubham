package com.shubham.basic;

public class MethodPracticeWithReturnType {
	public static void main(String[] args) {
		String firstName = "Shubham";
		String lastName = "Jha";
		float cgpa = 8.8f;
		String fullName = getName(firstName, lastName);
		float result = getPercentage(cgpa);
		System.out.println(fullName);
		System.out.println(result);
	}
	
	public static float getPercentage(float cgpa) {
		float result = cgpa * 10;
		return result;
	}
	
	public static String getName(String firstName, String lastName) {//Shubham Jha
		String fullName = firstName+" "+lastName;
		return fullName;
	}
}
