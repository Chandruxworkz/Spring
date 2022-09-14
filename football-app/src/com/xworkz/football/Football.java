package com.xworkz.football;

public class Football {
	String brand;
	String color;
	double price;
	boolean isAirFilled;
	String shape;
	
	Air air;
	
	String names[];
	

	public Football() {
		System.out.println("Object created");
	}
	
	
	public Air getAir() {
		return air;
	}


	public void setAir(Air air) {
		this.air = air;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAirFilled() {
		return isAirFilled;
	}

	public void setAirFilled(boolean isAirFilled) {
		this.isAirFilled = isAirFilled;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void spin() {
		System.out.println("Invoked spin()");
	}

	public void throwFootBall() {
		System.out.println("Invoked throwFootBall()");
	}

	@Override
	public String toString() {
		return "Football [brand=" + brand + ", color=" + color + ", price=" + price + ", isAirFilled=" + isAirFilled
				+ ", shape=" + shape + "]";
	}

}
