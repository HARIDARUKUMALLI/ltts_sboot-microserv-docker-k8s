package com.examples.spring.core.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired
	private Person person;
	
	public Customer()
	{
		
	}
	
	//@Autowired
	public Customer(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	//@Required
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@PostConstruct
	public void initiaze()
	{
		System.out.println("Bean is getting initialized...");
	}
	
	@PreDestroy
	public void cleanup()
	{
		System.out.println("Bean is getting cleaned up.");
	}	

}
