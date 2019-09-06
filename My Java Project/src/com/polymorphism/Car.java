//subclass of Vehicle
package com.polymorphism;

public class Car extends Vehicle{
String name;
Car()
{
	 
}
public Car(String color,String name)
{
	super(color);
	this.name=name;
}
void move()//over-ridden method
{
	System.out.println(color+"Color car is moving");
}
}
