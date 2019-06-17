package com.examples.spring.core.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class JavaConfigBasedDepedencyInjectionEx02 {

	public static void main(String[] args) {
		// Assemble the objects
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfiguration.class);

		Customer obj = (Customer) context.getBean("customer");

		System.out.println(
				obj.getPerson().getName() + " " + obj.getPerson().getAge() + " " + obj.getPerson().getLocation());

		context.registerShutdownHook();		
	}
}
