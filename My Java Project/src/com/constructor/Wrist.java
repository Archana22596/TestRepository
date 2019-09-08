package com.constructor;

public class Wrist 
{

	public static void main(String[] args) 
	{
		Watch w1=new Watch("Analog",1500);//creating w1 of type watch and initializing using Parameterized constructor
		Watch w2=new Watch("Digital",15500);//Parameterized constructor
		Watch w3=new Watch("Chronical",50500);//Parameterized constructor
		System.out.println("Type:"+w1.type+"  Price"+w1.price);//
		System.out.println("Type:"+w2.type+"  Price"+w2.price);
		System.out.println("Type:"+w3.type+"  Price"+w3.price);
	}

}
/*
Type:Analog  Price1500.0
Type:Digital  Price15500.0
Type:Chronical  Price50500.0
*/