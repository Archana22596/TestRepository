//Sample program to access the static variable declared in different class
package com.staticmembers;

public class S7
{
	static int i=20;
	public static void main(String[] args) 
	{
		int i=30;
		System.out.println(i);//30
		System.out.println(S7.i);//20
		System.out.println(S6.i);//10
	}

}
