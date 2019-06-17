package com.examples.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorld {
	
	public static void main(String[] args)
	{
//		Greetings greetings = new Greetings();
//		
//		System.out.println(greetings.getMessage());
		
		// Creating container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		
		// Accessing Greetings bean
		Greetings greetings = (Greetings) context.getBean("greetings");
		
		// Print Greetings message
		System.out.println(greetings.getMessage());
		
		// Print Bean Count
		System.out.println(context.getBeanDefinitionCount());
		
	}

}
