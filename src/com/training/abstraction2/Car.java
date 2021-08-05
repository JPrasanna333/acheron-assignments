package com.training.abstraction2;

public class Car extends Vehicle {
	public Car(String model, int price) {
		super(model, price);

	}

	void internal() {
		System.out.println("Car class internal()");
	}

	void external() {
		System.out.println("Car class external()");
	}

	void getMileage() {
		System.out.println("Mileage of the car model " + model + " = 12000 miles");
	}

}
