 



package com.xworkz.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTester {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("contextconfig.xml");
		System.out.println(container);
		Car car = container.getBean(Car.class);
		System.out.println("Car Name =" + car.brand);
		System.out.println("Car Price" + car.price);

		Integer integer = container.getBean(Integer.class);
		System.out.println("integer value=" + integer);

		String str = container.getBean(String.class);
		System.out.println("String value=" + str);

		Double double1 = container.getBean(Double.class);
		System.out.println("Double value=" + double1);

		Short short1 = container.getBean(Short.class);
		System.out.println("Short value=" + short1);

		Character character1 = container.getBean(Character.class);
		System.out.println("Character value=" + character1);

		Long long1 = container.getBean(Long.class);
		System.out.println("Long value=" + long1);

		//Boolean boolean1 = container.getBean(Boolean.class);
		//System.out.println("Boolean value=" + boolean1);

	}

}
