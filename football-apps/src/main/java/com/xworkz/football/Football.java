package com.xworkz.football;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Football {

	@Value("${PersonName}")
	private String footballName;

	@Value("${xworkz}")
	private boolean isAirFilled;

	private Air air;

	Integer i;

	@Autowired
	public Football(Air air) {
		super();
		this.air = air;
	}

	public Football() {
		System.out.println("Football bean created ");
	}

	public void setAir(Air air) {
		this.air = air;
	}

	public void setFootballName(String footballName) {
		this.footballName = footballName;
	}

	public void play() {
		System.out.println("invoked play");
		this.air.airMethod();
	}

	@Override
	public String toString() {
		return "Football [footballName=" + footballName + ", isAirFilled=" + isAirFilled + "]";
	}

}
