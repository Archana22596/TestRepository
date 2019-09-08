package com.encapsulation;

public class Circle extends Shape
{
	@Override
	double area(int length) 
	{
		double area=PI*length*length;
		System.out.println("Area of the circle is"+area);
		return 0;
	}
	
}
