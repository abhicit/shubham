package com.shubham.basic;

public class TestGetterSetterExample {
	public static void main(String[] args) {
		GetterSetterExample obj = new GetterSetterExample();
		obj.setName("Shubham");
		obj.setAge(25);
		obj.setQualification("B.E.");
		
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getQualification());
	}
}
