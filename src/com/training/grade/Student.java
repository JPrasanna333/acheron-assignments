package com.training.grade;

public class Student {
	String name;
	int studentId;

	Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	void getDetails() {
		System.out.println("Student name : " + name + "\n" + "Student Id : " + studentId);
	}

	void getGrades(int[] marks) {
		int sum = 0;
		int count = 0;
		for (int i : marks) {
			sum += i;
			count++;
		}

		System.out.println("Sum of all the marks of the " + name + " : " + sum);
		float average = sum / count;
		System.out.println("Average marks of the " + name + " : " + average);

		if (average >= 90) {
			System.out.println("Grade : A");
		} else if (average >= 80 && average < 90) {
			System.out.println("Grade : B");
		} else {
			System.out.println("Grade : C");
		}
	}

}
