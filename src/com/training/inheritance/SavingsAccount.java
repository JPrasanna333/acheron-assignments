package com.training.inheritance;

public class SavingsAccount extends Bank {
	double interest = 0.2;

	public SavingsAccount(double balance) {
		super(balance);

	}

	@Override
	public void withdraw(int withdraw) {
		System.out.println(+withdraw + " withdrawn from your Savings Account");
		balance -= withdraw;

	}

	@Override
	public void deposit(int deposit) {
		System.out.println(+deposit + " deposited from your Savings Account");
		balance = balance + deposit + (interest * deposit);

	}

}
