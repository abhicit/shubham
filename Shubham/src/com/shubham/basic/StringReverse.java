package com.shubham.basic;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println(reverse("shubham jha")); //mahbuhS
	}
	//String sb = "";
	
	public static String reverse(String str) {//str = "sj" ==> "js"
		StringBuffer sb = new StringBuffer(str);
		/*
		 * for(int i = 0; i < str.length(); i++) { for(int j = str.length()-1; j >= 0;
		 * j--) { if(j <= i) break; char temp = str.charAt(i); //s char a =
		 * str.charAt(j); //j char b = temp; //s sb.append(a).append(b); } }
		 */
		int start = 0, end = sb.length()-1;
		while(start <= end) {
			char temp = sb.charAt(start);
			char a = sb.charAt(end);
			sb.setCharAt(start, a);
			sb.setCharAt(end, temp);
			start++;
			end--;
		}
		return sb.toString();
	}
}
