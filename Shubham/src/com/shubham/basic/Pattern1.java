package com.shubham.basic;

/*
 *5 4 3 2 1
		  * 1
		* * 2
	  * * * 3
	* * * * 4
  *	* * * * 5
  
 */

public class Pattern1 {
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		for(int i = 1; i <= 5; i++) {
			int count = 1;
			for(int j = 5; j >= 1; j--) {
				if(j > i)
					System.out.print(j);
				else
					System.out.print(count++);
			}
			System.out.println();
		}
	}
}
