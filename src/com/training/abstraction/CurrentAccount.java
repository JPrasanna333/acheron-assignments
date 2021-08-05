package com.training.abstraction;

public class CurrentAccount extends Account {
	double interest = 0.2;

	public CurrentAccount(double balance) {
		super(balance);

	}

	@Override
	public void withdraw(int withdraw) {
		System.out.println(+withdraw + " withdrawn from your Current Account");
		balance = balance - withdraw - (interest * withdraw);
	}

	@Override
	public void deposit(int deposit) {
		System.out.println(+deposit + " deposited from your Current Account");
		balance += deposit;
	}

}
