package com.shubham.oops;

class BankAccount{
	String name;
	String accNo;
	int balance;
	String dob;
	TransactionHistory history;//Composition
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public TransactionHistory getHistory() {
		return history;
	}
	public void setHistory(TransactionHistory history) {
		this.history = history;
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accNo=" + accNo + ", balance=" + balance + ", dob=" + dob + "]";
	}
}

class TransactionHistory{
	int amount;
	String dot;
	String beneAcc;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDot() {
		return dot;
	}
	public void setDot(String dot) {
		this.dot = dot;
	}
	public String getBeneAcc() {
		return beneAcc;
	}
	public void setBeneAcc(String beneAcc) {
		this.beneAcc = beneAcc;
	}
	@Override
	public String toString() {
		return "TransactionHistory [amount=" + amount + ", dot=" + dot + ", beneAcc=" + beneAcc + "]";
	}
	
	
}

public class CompositionExample {
	public static void main(String[] args) {
		BankAccount shubham = new BankAccount();
		shubham.setAccNo("SHU01");
		shubham.setBalance(100000);
		shubham.setDob("01-01-1996");
		TransactionHistory history = new TransactionHistory();
		history.setAmount(50000);
		history.setBeneAcc("Aman");
		history.setDot("16-08-2021");
		shubham.setHistory(history);
		shubham.setName("Shubham");
		
		System.out.println(shubham.toString()+"\n"+history.toString());
	}
}
