package com.shubham.oops;

public class StudentTest {
	public static void main(String[] args) {
		//Using constructor
		Student shubham = new Student("Shubham", 41, "EEE");
		System.out.println(shubham.getName()+" "
		+shubham.getRoll()+" "+shubham.getBranch()+" "
				+shubham.getCollege());
		System.out.println(shubham.toString());
		
		//Using setter method
		Student shubham1 = new Student();
		shubham1.setName("Abhinav");
		shubham1.setRoll(1);
		shubham1.setBranch("ECE");
		System.out.println(shubham1.getName()+" "
				+shubham1.getRoll()+" "+shubham1.getBranch()+" "
						+shubham1.getCollege());
	}
}
