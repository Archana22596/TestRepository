//Audi is the subclass of class car
package com.polymorphism;

public class Audi extends Car 
{
String type;
Audi(){
	
}
Audi(String color,String name,String type)
{
	super(color, name);
	this.type=type;
}
@Override
void move(String location)//overriding method
{
	System.out.println(type+"Car is moving towards"+location);
}

}
