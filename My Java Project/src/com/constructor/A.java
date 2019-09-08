package com.constructor;

public class A {
	A()
	{
		this(10);
		System.out.println("From B()");
	}
	A(double d)
	{
		//this(20);//this() can't be used for recursive constructor chaining
		System.out.println("from double");
	}
	A(int i)
	{
		this(20.33);//this() should be the first statement in the constructor
		System.out.println("From B(int)");
	}

	public static void main(String[] args) 
	{
		A ob1 =new A();
		System.out.println("----------");
		A ob2 = new A(10);
	}

}
/*
from double
From B(int)
From B()
----------
from double
From B(int)

*/
 