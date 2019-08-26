//Sample program for static blocks and class loading  
package com.staticmembers;

public class S12 {
	static
	{
		System.out.println("SIB-2");
	}

	public static void main(String[] args)
	{
		System.out.println("Main method executes");

	}
	static
	{
		System.out.println("SIB-1");
	}

}
/*
SIB-2
SIB-1
Main method executes
*/