package com.examples.spring.core;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
		
//		Car alto = new Car();
//		alto.setManufacturer("Maruti");
//		alto.setModel("Alto");
//		alto.setColor("White");
//		
//		Engine k10 = new Engine();
//		k10.setEngineCapacity(1000);
//		k10.setNoOfCyclinders(3);
//		k10.setPower(5);
//		
//		alto.setEngine(k10);
		
//		alto.printDetails();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		Car alto = (Car) context.getBean("alto");
		alto.printDetails();		
	}

}
