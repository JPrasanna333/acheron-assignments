package com.training.basics;

import java.util.*;

public class DuplicatesInArray {

	public static void main(String[] args) {
		System.out.println("Enter the no of elements");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = kb.nextInt();
		}
		Set<Integer> s = new LinkedHashSet<>();
		for (int i : a) {
			s.add(i);
		}
		System.out.println("Total Number of duplicates are " + (a.length - s.size()));
		kb.close();

	}

}
