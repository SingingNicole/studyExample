package com.test02;

public class Account {

	private String account;
	private int balance;
	private double interestRate;

	Account() {
	}

	Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	} // 매개변수로 값 지정

	public void setAccount(String account) { // setter
		this.account = account;
	}

	public String getAccount() { // getter
		return account;
	} // 가지고 있는 값을 리턴

	public int getBalance() {
		return balance;
	}

	public double calculateInterest() {
		return ((balance * interestRate) / 100);
	}

	public void deposit(int deposit) {
		balance += deposit;
	}

	public void withdraw(int withdraw) {
		if (balance - withdraw >= 0) {
			balance -= withdraw;
		}
	}

}
