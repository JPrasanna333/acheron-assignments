package com.training.interface1;

public class Employee extends Details {

	public Employee(String name, String city) {
		super(name, city);
	}

	@Override
	public void joinCourse() {

		System.out.println("Employee join the course");

	}

	@Override
	public void showSports() {
		System.out.println("Employee sports()");

	}

}
