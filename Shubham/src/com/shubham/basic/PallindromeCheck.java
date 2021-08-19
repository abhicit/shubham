package com.shubham.basic;

public class PallindromeCheck {
	public static void main(String[] args) {
		System.out.println(checkPallindrome("razmallamzar"));
	}
	
	public static boolean checkPallindrome(String str) {//abca
		if(str == null)
			return false;
		if(str.charAt(0) != str.charAt(str.length()-1))
			return false;
		int start = 0, end = str.length()-1;
		while(start <= end) {
			if(str.charAt(start) != str.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
}
