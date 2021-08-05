package com.training.basics;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}

		}
		if (n == sum) {
			System.out.println(n + " is a Perfect number");
		} else {
			System.out.println(n + " is not a Perfect number");
		}
		kb.close();

	}

}
