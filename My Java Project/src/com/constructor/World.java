package com.constructor;

public class World {

	public static void main(String[] args) 
	{
		Animal a1=new Animal(10,15);
		Animal a2=new Animal(20,35);
		System.out.println("Height:"+a1.height+"Weight:"+a1.weight);
		System.out.println("Height:"+a2.height+"Weight:"+a2.weight);
	}

}
