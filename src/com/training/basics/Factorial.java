package com.training.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int fact = 1;
		while (n != 0) {
			fact = fact * n;
			--n;
		}
		System.out.println(fact);
		kb.close();


	}

}
