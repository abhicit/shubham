package com.shubham.basic;

public class CheckContainsVowel {
	public static void main(String[] args) {
		System.out.println(isVowelPresent("Aman"));
	}
	
	public static boolean isVowelPresent(String str) {
		return (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
				|| str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) ? true : false;
	}
}
