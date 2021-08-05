package com.training.inheritance;

public class Bank {
	double balance;

	Bank(double balance) {
		this.balance = balance;
	}

	public Bank() {
	}

	public void withdraw(int withdraw) {
		balance = balance - withdraw;
	}

	public void deposit(int deposit) {
		balance = balance + deposit;
	}

	public double balance() {
		return balance;
	}

}
