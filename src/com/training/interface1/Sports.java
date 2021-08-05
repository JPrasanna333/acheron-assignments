package com.training.interface1;

public interface Sports {
	void showSports();

	default void printName() {
		System.out.println("Employee Sports Academy");
	}

}
