package com.training.interface1;

public abstract class Details implements Training, Sports {
	String name, city;

	public Details(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	void getDetails() {
		System.out.println("Name : " + name);
		System.out.println("City :" + city);
	}

}
