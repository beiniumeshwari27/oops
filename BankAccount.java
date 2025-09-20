package com.codegnan.oopexamples;

public class BankAccount {
	double balance;
	public BankAccount(double balance) {
		this.balance=balance;
		
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("deposited by cash:"+amount);
		
	}
	public void deposit(double amount,String chequeNumber) {
		balance+=amount;
		System.out.println("deposited"+amount+"via ChequeNumber#"+chequeNumber);
	}
	public void deposit(double amount,String transactionId,String bankName) {
		balance+=amount;
		System.out.println("Deposited"+amount+"via Online tranfer");
		System.out.println("Transaction Id:"+transactionId+"Bank:"+bankName);
	}
	public void showBalance() {
		System.out.println("Current Balance is:"+balance);
	}
	}


