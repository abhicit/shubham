package com.shubham.oops;

public class Bank {
	private String name;
	private int accountNumber;
	private int balance;
	private static String bankName = "SBI";
	
	public Bank() {}
	
	public Bank(String name, int accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static String getBankName() {
		return bankName;
	}
	public static void setBankName(String bankName) {
		Bank.bankName = bankName;
	}
	
	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}
	
}
