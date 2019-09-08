package com.constructor;

public class Company2 
{

	public static void main(String[] args)
	{
		Laptop l1=new Laptop("HP",64,45000);
		Laptop l2=new Laptop("Dell",36,30000);
		Laptop l3=new Laptop("Lenovo",256,86000);
		
		System.out.println("Brand:"+l1.brand+" ram:"+l1.ram+"Price: "+l1.price);
		System.out.println("Brand:"+l2.brand+" ram:"+l2.ram+"Price: "+l2.price);
		System.out.println("Brand:"+l3.brand+" ram:"+l3.ram+"Price: "+l3.price);
		
	}

}
