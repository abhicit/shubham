package com.shubham.basic;

public class SwitchCaseExample {
	public static void main(String[] args) {
		printDay("jhb");
	}
	
	public static void printDay(String day) {
		switch(day) {
		case "mon":
			System.out.println("Monday");
			break;
		case "tue":
			System.out.println("Tuesday");
			break;
		case "wed":
			System.out.println("Wednesday");
			break;
		case "thu":
			System.out.println("Thursday");
			break;
		case "fri":
			System.out.println("Friday");
			break;
		case "sat":
			System.out.println("Saturday");
			break;
		case "Sun":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No day");
		}
	}
}
