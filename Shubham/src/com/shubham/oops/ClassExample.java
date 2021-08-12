package com.shubham.oops;

class Male{
	String name;
	int age;
	String height;
	String qualification;
	static String village = "Katihaar";
	Male(){//No-arg constructor
		System.out.println("Hello world");
		this.study();
		System.out.println("Study method called by constructor");
	}
	
	Male(String qualification){//Parameterized Constructor
		this.qualification = qualification;
	}
	
	Male(String name, int age, String height){//Parameterized Constructor
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void study() {
		System.out.println("Shubham is studying...");
	}

	@Override
	public String toString() {
		return "Male [name=" + name + ", age=" + age + ", height=" + height + ", village="+ village +"]";
	}
	
}

public class ClassExample {
	public static void main(String[] args) {
		Male shubham = new Male("Shubham", 24, "5'11");
		Male aman = new Male("Aman", 16, "6");
		shubham.study();
		System.out.println(shubham.toString());
		System.out.println(shubham.name);
		System.out.println(shubham.age);
		System.out.println(aman.toString());
	}
}
