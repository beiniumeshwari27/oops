package com.codegnan.oopexamples;

public class BankManagement {

	public static void main(String[] args) {
		
		BankAccount account=new BankAccount(5000);
		account.deposit(10000);
		account.deposit(2000,"CHQ79834");
		account.deposit(3000,"86876721236","HDFC");
		account.showBalance();

	}

}
