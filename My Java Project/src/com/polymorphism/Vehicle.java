//Vehicle is the parent class 
package com.polymorphism;

public class Vehicle
{
	String vehicleNumber;
	String color;
	static int vehicleCount;
	Vehicle()
	{
		vehicleCount++;
		vehicleNumber="KA"+vehicleCount;
	}
	
	Vehicle(String color)
	{
		this();
		this.color=color;
	}
	void move()
	{
		System.out.println("Vehicle is moving");
	}
void move(String location)
{
	System.out.println("Vehicle is moving towards"+location);
}
}
