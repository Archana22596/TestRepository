/*WAP to design a class representing an entity known as marker having the following properties
 1.String color
 2.String name
 3.double length
 4.int price
 
 Design the method initialize to assign  value
 
The method should accept the value which is to be initialized
 */

package com.nonstatic;

public class Marker
{
	String color;
	String name;
	double length;
	int price;
	 void initialize(String color,String name,double length,int price)
	{
		this.color=color;
		this.name=name;
		this.length=length;
		this.price=price;
		System.out.println("The color="+this.color+"\n The name="+this.name+"\n The length= "+this.length+"\n The price= "+this.price);
		
	}
	
	public static void main(String[] args) 
	{
		Marker ob1=new Marker();
		ob1.initialize("red","rorito",10.0,100);
		Marker ob2=new Marker();
		ob2.initialize("Black","Camlin",5.0,50);
	}

}
