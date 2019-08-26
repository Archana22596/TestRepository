//Sample program to access static meembers directly and by using class name
package com.staticmembers;

public class S3 
{
static int i=20;
	public static void main(String[] args) 
	{
		System.out.println(i);//directly//20
		System.out.println(S3.i);//using class name//20
		S3.i=30;
		System.out.println(i);//30
		
	}
	
	
}

