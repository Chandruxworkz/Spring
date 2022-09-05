package com.xworkz.tv;

public class SetTopBox {
	private	 String name;
	private	 Double price;


	public SetTopBox(String name) {
		this.name = name;
	}

	public SetTopBox(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public SetTopBox() {
		System.out.println(this.getClass().getSimpleName()+"SetupBox Bean is created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


}
