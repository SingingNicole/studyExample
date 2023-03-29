package com.test02;

public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account("441-0290-1203", 500000, 7.3);

		account.setAccount("441-0290-1203");

		System.out.println("계좌 정보 : " + account.getAccount() + " 현재 잔액 : " + account.getBalance());

		account.deposit(20000);

		System.out.println("계좌 정보 : " + account.getAccount() + " 현재 잔액 : " + account.getBalance());

		System.out.println("이자 : " + account.calculateInterest());

	}

}
