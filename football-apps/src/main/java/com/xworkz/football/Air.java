package com.xworkz.football;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.football.dao.FootballDAO;

@Component
public class Air{
    @Value("22")
	int a;
	
    @Autowired
	FootballDAO dao;
	
	public Air() {
		System.out.println(this.getClass().getSimpleName() + " bean created ");
	}
	public void airMethod() {
		System.out.println("invoked airMethod()");
	}

}
