package com.nonstatic;

//WAP to design a class representing an entity known as marker having the following properties ppackage com.nonstatic;

public class Marker1 
{
	
		String color;
		String name;
		double length;
		int price;
		int i;
		void initialize(String color,String name,double length,int price)
		{
			this.color=color;
			this.name=name;
			this.length=length;
			this.price=price;
			
		}
		
		public static void main(String[] args) 
		{
			Marker1 ob=new Marker1();
			ob.initialize("red","rorito",10.0,100);
			System.out.println("The color="+ob.color+"\n The name="+ob.name+"\n The length= "+ob.length+"\n The price= "+ob.price);
			ob.initialize("black","camlin",20,50);
			System.out.println("The color="+ob.color+"\n The name="+ob.name+"\n The length= "+ob.length+"\n The price= "+ob.price);
		}

}

