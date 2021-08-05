package com.training.grade;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the Student name");
		String name1 = kb.nextLine();

		System.out.println("Enter the Student ID");
		int studentId1 = kb.nextInt();

		System.out.println("Enter the number of Subject");
		int n1 = kb.nextInt();

		int[] marks1 = new int[n1];
		System.out.println("Enter the marks of the each subjects");
		for (int i = 0; i < n1; i++) {
			marks1[i] = kb.nextInt();
		}

		System.out.println("Enter the another Student name");
		String name2 = kb.next();

		System.out.println("Enter the Student ID");
		int studentId2 = kb.nextInt();

		System.out.println("Enter the number of Subject");
		int n2 = kb.nextInt();

		int[] marks2 = new int[n2];
		System.out.println("Enter the marks of the each subjects");
		for (int i = 0; i < n2; i++) {
			marks2[i] = kb.nextInt();
		}

		Student s1 = new Student(name1, studentId1);
		s1.getDetails();
		s1.getGrades(marks1);
		System.out.println();
		Student s2 = new Student(name2, studentId2);
		s2.getDetails();
		s2.getGrades(marks2);
		kb.close();

	}

}
