package com.training.abstraction2;

public abstract class Vehicle extends Accessories {
	String model;
	int price;

	public Vehicle(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	abstract void getMileage();

	void getDetails() {
		System.out.println("Model "+model);
		System.out.println("Price "+price);
	}

	

}
