package com.constructor;

public class B {
	int a;
	B()
	{
		this(10);
		System.out.println("From B()");
	}
	B(int i)
	{
		//this();--Compile time error
		System.out.println("From B(int)");
	}

	public static void main(String[] args) 
	{
		B ob1 =new B();
		System.out.println("----------");
		B ob2 = new B(10);
	}

}
/*
 
From B(int)
From B()
----------
From B(int)
 
*/