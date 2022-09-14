package com.xworkz.tv.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.xworkz.tv")
public class BeanConfig {

	@Bean
	public PropertyPlaceholderConfigurer createBean() {
		System.out.println("Invoked createBean()");
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		//configurer.setLocation("tv.properties");
		return configurer;

}
}
