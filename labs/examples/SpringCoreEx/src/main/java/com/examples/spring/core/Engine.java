package com.examples.spring.core;

public class Engine {

	private int engineCapacity;
	private int power;
	private int noOfCyclinders;
	
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getNoOfCyclinders() {
		return noOfCyclinders;
	}
	public void setNoOfCyclinders(int noOfCyclinders) {
		this.noOfCyclinders = noOfCyclinders;
	}
	
	public void printDetails()
	{
		System.out.println("engineCapacity: " + engineCapacity);
		System.out.println("power: " + power);
		System.out.println("noOfCyclinders: " + noOfCyclinders);
	}	
	
	
	
}
