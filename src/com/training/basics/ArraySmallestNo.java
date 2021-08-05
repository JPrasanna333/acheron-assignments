package com.training.basics;

import java.util.Scanner;

public class ArraySmallestNo {

	public static void main(String[] args) {
		System.out.println("Enter the no of elements");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = kb.nextInt();
		}
		int min = a[0];
		for (int i : a) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println(min);
		kb.close();

	}

}
