package com.xworkz.football.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan(basePackages = "com.xworkz.football")
public class BeanConfig {

	@Bean
	public PropertySourcesPlaceholderConfigurer createBean() {
		System.out.println("Invoked createBean()");
		PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		Resource resource = new ClassPathResource("football.properties");
		placeholderConfigurer.setLocation(resource);
		return placeholderConfigurer;
	}

}
