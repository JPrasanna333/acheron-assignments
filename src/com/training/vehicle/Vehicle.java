package com.training.vehicle;


public class Vehicle {
	String name;
	String model;
	int price;

	Vehicle(String name, String model, int price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}

	void getDetails() {
		System.out.println("Vehicle Name: " + name + "\n" + "Model: " + model + "\n" + "Price: " + price);

	}
	


}
