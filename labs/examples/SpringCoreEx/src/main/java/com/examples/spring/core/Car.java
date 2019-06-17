package com.examples.spring.core;

public class Car {

	private String model;
	private String manufacturer;
	private String color;
	private Engine engine;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	} 
	
	public void printDetails()
	{
		System.out.println("Model: " + model);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Color: " + color);
		engine.printDetails();
	}
	
	
}
