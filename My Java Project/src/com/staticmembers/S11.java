//Calling a static method in same class directly 
package com.staticmembers;

public class S11
{
	static int a = 20;
	static void test()
	{
		int a =10;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		System.out.println(a);//20
		System.out.println(S6.i);//10
		test();//10
		System.out.println(a);//20
		

	}

}
