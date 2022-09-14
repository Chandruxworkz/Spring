package com.xworkz.football.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionConfig {

	public String url;

	public String userName;

	public String password;

	public ConnectionConfig
	(@Value("${url}") String url, @Value("${un}") 
	String userName, @Value("${pwd}") String password) {

		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "ConnectioConfig [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
