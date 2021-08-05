package com.training.interface1;

public class Main {

	public static void main(String[] args) {
		Training t = new Employee("Jack", "Pondy");

		Details d = (Details) t;
		d.getDetails();

		t.joinCourse();

		Sports s = (Sports) t;
		s.showSports();
		s.printName();

		System.out.println();

		Training t1 = new Student("Prasanna", "Pondy");
		Details d1 = (Details) t1;
		d1.getDetails();

		t1.joinCourse();

		Sports s1 = (Sports) t1;
		s1.showSports();
		s1.printName();

		Hobbies h1 = (Hobbies) t1;
		h1.showHobbies();

	}

}
