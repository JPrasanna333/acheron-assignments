package com.training.interface1;

public class Student extends Details implements Hobbies {

	public Student(String name, String city) {
		super(name, city);
	}

	@Override
	public void joinCourse() {
		System.out.println("Student join the course");

	}

	@Override
	public void showSports() {
		System.out.println("Student showSports()");

	}

	@Override
	public void showHobbies() {
		System.out.println("Student hobbies()");

	}

	public void printName() {
		System.out.println("Students Sports Academy");
	}

}
