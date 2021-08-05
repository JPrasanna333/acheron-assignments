package com.training.basics;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int temp = n;
		int rem;
		int sum = 0;
		while (temp != 0) {
			rem = temp % 10;
			sum += rem * rem * rem;
			temp = temp / 10;
		}
		if (sum == n) {
			System.out.println("It is an Armstrong number");
		} else {
			System.out.println("It is not an Armstrong number");
		}
		kb.close();

	}

}
