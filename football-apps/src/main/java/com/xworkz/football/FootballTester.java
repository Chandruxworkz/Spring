package com.xworkz.football;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.xworkz.football.config.BeanConfig;
import com.xworkz.football.dao.ConnectionConfig;

@Component
public class FootballTester {

	public static void main(String[] args) {
		// step a container or start the ApplicationContext
		try {
			// XML based config
			// ApplicationContext xmlcontainer=new ClassPathXmlApplicationContext("beanConfig.xml");
			// Annotation based Config
			ApplicationContext container = new AnnotationConfigApplicationContext(BeanConfig.class);
			System.out.println(container);
			Football football = container.getBean(Football.class);
			System.out.println(football.toString());
			football.play();
			ConnectionConfig connectionConfig = container.getBean(ConnectionConfig.class);
			String string = connectionConfig.toString();
			System.out.println(string);
			ClassPathXmlApplicationContext c = (ClassPathXmlApplicationContext) container;
		} finally {

			// c.close();
		}

	}

}
