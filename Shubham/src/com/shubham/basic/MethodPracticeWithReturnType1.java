package com.shubham.basic;

public class MethodPracticeWithReturnType1 {
	public static void main(String[] args) {
		int age = 17;
		Boolean job = true;
		String age1 = isAdult(age);
		String hasJob = hasJob(job);
		System.out.println(age1);
		System.out.println(hasJob);
	}
	
	public static String isAdult(int age) {
		if(age >= 18) {
			return "Person is adult";
		}else {
			return "Person is not adult";
		}
	}
	
	public static String hasJob(Boolean hasJob) {
		if(hasJob)
			return "Person has job";
		else
			return "Person is jobless";
	}
}
