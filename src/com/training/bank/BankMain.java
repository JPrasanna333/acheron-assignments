package com.training.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Bank b = new Bank(15000.89);
		Scanner kb = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your choice\n");
			System.out.println("1.Withdraw\n2.Deposit\n3.Balance\n4.Exit");
			int choice = kb.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount to withdraw");
				int withdraw = kb.nextInt();
				b.withdraw(withdraw);
				break;
			case 2:
				System.out.println("Enter the amount to get deposit in the bank");
				int deposit = kb.nextInt();
				b.deposit(deposit);
				break;
			case 3:
				System.out.println("Current Balance amount is " + b.balance);
				break;
			case 4:
				System.out.println("Exited");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter the correct choice");
			}

		}

	}
}
