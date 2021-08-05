package com.training.basics;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("ENTER THE NO");
		Scanner kb = new Scanner(System.in);
		long num = kb.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " IS A PRIME NO");
		} else {
			System.out.println(num + " IS NOT A PRIME NO");
		}
		kb.close();

	}

}
