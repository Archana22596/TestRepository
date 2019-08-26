//Demo program to show illegal Forward reference error
package com.staticmembers;

public class S16 
{
	static 
	{
		//System.out.println(i); Illegal forward reference error
	}
	static int i;
	public static void main(String[] args) 
	{
	System.out.println(i);	//0
	}
                     
}
