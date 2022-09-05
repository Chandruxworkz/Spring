package com.xworkz.tv;

public class TV {
	private String brand;
	private String color;
	private Double price;
	private Display display;
	private Remote remote;
	private SetTopBox setTopBox;
	private TVStand tvStand;

	public TV() {
		System.out.println(this.getClass().getSimpleName() + "Tv bean is created");

	}

	public TV(String brand, String color, Double price, Display display, Remote remote, SetTopBox setTopBox,
			TVStand tvStand) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.display = display;
		this.remote = remote;
		this.setTopBox = setTopBox;
		this.tvStand = tvStand;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Remote getRemote() {
		return remote;
	}

	public void setRemote(Remote remote) {
		this.remote = remote;
	}

	public SetTopBox getSetTopBox() {
		return setTopBox;
	}

	public void setSetTopBox(SetTopBox setTopBox) {
		this.setTopBox = setTopBox;
	}

	public TVStand getTvStand() {
		return tvStand;
	}

	public void setTvStand(TVStand tvStand) {
		this.tvStand = tvStand;
	}

	@Override
	public String toString() {
		return "TV [brand=" + brand + ", color=" + color + ", price=" + price + ", display=" + display + ", remote="
				+ remote + ", setTopBox=" + setTopBox + ", tvStand=" + tvStand + "]";
	}
	
	
}
