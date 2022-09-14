package com.xworkz.car;

public class Car {
	String brand;
	double price;

	public Car(String brand) {
		this.brand = brand;
		System.out.println("Bean Created");

	}

	public Car(String brand, double price) {
		this.brand = brand;
		this.price = price;
		System.out.println("Bean Crearted");

	}

}
