// To create a class rider with any two objects

package com.nonstatic;

public class Rider {

	public static void main(String[] args)
	{
		Vehicle v1=new Vehicle();
		v1.name="car";
		v1.colour="Black";
		v1.speed=60.2;
		System.out.println("Vehicle1 name:"+v1.name+" \nColour: "+v1.colour+"\nspeed:"+v1.speed+" kmph");
		Vehicle v2=new Vehicle();
		v2.name="Bike";
		v2.colour="Grey";
		v2.speed=85;
		System.out.println("Vehicle2 name:"+v2.name+"\nColour: "+v2.colour+"\nspeed:"+v2.speed+" kmph");

	}

}/*
Vehicle1 name:car 
Colour: Black
speed:60.2 kmph
Vehicle2 name:Bike
Colour: Grey
speed:85.0 
kmp*/
