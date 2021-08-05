package com.training.basics;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (n != 10) {
					System.out.print(n);
					n++;
				}
			}
			System.out.println();
		}

	}

}
