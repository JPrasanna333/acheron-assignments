package com.training.basics;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		System.out.println("Enter the no of elements");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = kb.nextInt();
		}
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		System.out.println("Sum of the digits in array " + sum);
		int avg = 0;
		for (int j : a) {
			avg += j;
		}
		System.out.println("Average of the digits in the array " + (float) avg / n);
		kb.close();

	}

}
