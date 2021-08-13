package com.shubham.oops;

public class BankTest {
	public static void main(String[] args) {
		Bank acc1 = new Bank("Shubham", 12345, 10000);
		System.out.println(acc1.getName()+" "
				+acc1.getAccountNumber()+" "
				+acc1.getBalance()+" "+acc1.getBankName());
		acc1.withdraw(5000);
		System.out.println(acc1.getBalance());
	}
}
