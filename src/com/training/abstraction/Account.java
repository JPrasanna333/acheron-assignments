package com.training.abstraction;

public abstract class Account {
	double balance;

	Account(double balance) {
		this.balance = balance;
	}

	public abstract void withdraw(int withdraw);

	public abstract void deposit(int deposit);

	public double balance() {
		return balance;
	}

}
