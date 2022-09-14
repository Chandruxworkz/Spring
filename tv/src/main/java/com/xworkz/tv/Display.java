package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Display {
	
	@Value("5000")
	private	Double price;
	@Value("Samsung")
	private	String name;

		public Display() {
			System.out.println(this.getClass().getSimpleName() + " " + "Dispaly bean is created");
		}

		public Display(Double price) {
			this.price = price;
		}

		public Display(Double price, String name) {
			this.price = price;
			this.name = name;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Dispaly [price=" + price + ", name=" + name + "]";
		}


}
