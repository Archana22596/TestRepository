package com.nonprimitivearray;

public class Parking
{
	public static void display(Bikes[] park)
	{
	for (int i = 0; i < park.length; i++)
	{
		System.out.println(park[i].brand);
		System.out.println(park[i].mileage);
		System.out.println(park[i].color);
	}
	}

	public static void main(String[] args) 
	{
		Bikes[] park=new Bikes[4];
		park[0]=new Bikes("R15",75,"White");
		park[1]=new Bikes("Pulsar",100,"Black");
		park[2]=new Bikes("Royal Enfield",85,"NavyGreen");
		park[3]=new Bikes("Kawasaki",50,"Green");
		display(park);
		
	}
}
