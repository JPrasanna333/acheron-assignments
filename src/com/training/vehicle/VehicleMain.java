package com.training.vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Pulser", "Az", 100000);
		v1.getDetails();
		System.out.println();
		Vehicle v2 = new Vehicle("Honda", "WX", 80000);
		v2.getDetails();
	}

}
