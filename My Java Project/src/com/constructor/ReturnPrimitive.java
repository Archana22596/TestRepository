//Designing a method which can return a non-primitive value
package com.constructor;

public class ReturnPrimitive {

	int i;
	public static ReturnPrimitive createObject()
	{
		return new  ReturnPrimitive();
	}
	public static void main(String[] args)
	{
		ReturnPrimitive ob= ReturnPrimitive.createObject();
		System.out.println(ob.i);
		ob.i=10;
		System.out.println(ob.i);
		ReturnPrimitive ob1= ReturnPrimitive.createObject();
		System.out.println(ob1.i);
	}

}
