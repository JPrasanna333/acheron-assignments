package com.training.abstraction2;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = new Car("A1X", 123444);
		vehicle.external();
		vehicle.internal();
		vehicle.getMileage();
		vehicle.getDetails();

	}

}
