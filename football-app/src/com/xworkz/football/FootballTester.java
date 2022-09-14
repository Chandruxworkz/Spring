package com.xworkz.football;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FootballTester {

	public static void main(String[] args) {
		// step 1 Object creation
		Football football = new Football();

		// step 2 Object init()
		football.setBrand("dbjshjsd");
		football.setColor("black");
		football.setPrice(111.3);
		football.setAirFilled(false);
		football.setShape("round");
		football.setAir(new Air());
		System.out.println(football);
		// step 3 object destroy
		//football = null;

		try {
			FileReader reader = new FileReader("E:\\chandrugit\\java\\football-app\\src\\football.properties");
			Properties properties = new Properties();
			properties.load(reader);
			String footballprice = properties.getProperty("footballPrice");
			System.out.println("footballprice " + footballprice);
			Double double1 = new Double(footballprice);
			football.setPrice(double1);
			System.out.println(football);
			String name = properties.getProperty("name");
			String[] names = name.split(",");
			for (String string : names) {
				System.out.println(name);
			}
			System.out.println("name ="+name);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
