package com.training.overloading;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of employee");
		int n = kb.nextInt();
		String[] name = new String[n];
		String[] designation = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Employee name");
			name[i] = kb.next();
			System.out.println("Enter the Designation of the Employee");
			designation[i] = kb.next().toLowerCase();
		}
		for (int i = 0; i < n; i++) {

			Employee e1 = new Employee(name[i], designation[i]);
			if (designation[i].equals("programmer")) {
				double bonus = e1.calcBonus(13000);
				System.out.println("Bonus amount given for the employee " + name[i] + " with designation as "
						+ designation[i] + " = " + bonus);

			} else if (designation[i].equals("manager")) {
				double bonus = e1.calcBonus(13000, 3000);
				System.out.println("Bonus amount given for the employee " + name[i] + " with designation as "
						+ designation[i] + " = " + bonus);

			} else if (designation[i].equals("director")) {
				double bonus = e1.calcBonus(13000, 3000, 7000);
				System.out.println("Bonus amount for the employee " + name[i] + " with designation as " + designation[i]
						+ " = " + bonus);

			} else {
				System.out.println("Please enter the correct designation for the employee " + name[i]);
			}
		}

		kb.close();

	}

}
