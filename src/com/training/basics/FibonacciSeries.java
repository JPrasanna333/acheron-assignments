package com.training.basics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int firstno = 0;
		int secondno = 1;
		int thirdno;
		System.out.print(firstno + " ");
		System.out.print(secondno + " ");
		n = n - 2;
		while (n != 0) {
			thirdno = firstno + secondno;
			System.out.print(thirdno + " ");
			firstno = secondno;
			secondno = thirdno;
			--n;
		}
		kb.close();

	}

}
