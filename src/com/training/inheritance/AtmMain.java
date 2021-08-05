package com.training.inheritance;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your account type");
		System.out.println("1.Current Account\n2.Savings Account\n3.Bank");
		int type = kb.nextInt();
		Bank b = null;
		switch (type) {
		case 1:
			b = new CurrentAccount(15000.09);
			break;
		case 2:
			b = new SavingsAccount(15000.09);
			break;
		case 3:
			b = new Bank(15000.09);
			break;
		default:
			System.out.println("Please choose the valid account type");
		}
		while (true) {
			System.out.println("Enter your choice\n");
			System.out.println("1.Withdraw\n2.Deposit\n3.Balance\n4.Exit");
			int choice = kb.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount to withdraw");
				int withdraw = kb.nextInt();
				if (withdraw <= b.balance()) {
					b.withdraw(withdraw);
				} else {
					System.out.println("Please check your balance");
				}
				break;
			case 2:
				System.out.println("Enter the amount to get deposit in the bank");
				int deposit = kb.nextInt();
				b.deposit(deposit);
				break;
			case 3:
				System.out.println("Current Balance amount is " + b.balance());
				break;
			case 4:
				System.out.println("Exited");
				System.exit(0);
			default:
				System.out.println("Please enter the correct choice");
				kb.close();

			}

		}

	}
}
