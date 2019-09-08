package com.constructor;

public class Marker2 
{
	String color;
	double length;
	Marker2(String color, double length)
	{
		this.color=color;
		this.length=length;
	}

	public static void main(String[] args) 
	{
		Marker2 m1 = new Marker2("Black", 3.5);
		System.out.println("Color:"+m1.color+"   length:"+m1.length);
	}

}
