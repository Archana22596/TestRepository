//A class having more than one constructor with different formal arguments is called as constructor overloading
//Which constructor gets executed during object creation depends upon the actual arguments passed 
//during object creation
package com.constructor;

public class P4 
{
	P4()
	{
		System.out.println("P4() constructor");
	}
	P4(int a)
	{
		System.out.println("P4(int) constructor");
	}
	
	public static void main(String[] args) 
	{
		P4 ob = new P4();
		System.out.println("+++");
		P4 ob2 = new P4(10);
	}

}
