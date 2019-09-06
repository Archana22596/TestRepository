//demo program for runtime polymorphism
package com.polymorphism;

public class B extends A
{
	void test()
	{
		System.out.println("From test() B");
	}
	public static void main(String[] args) 
	{
		A ob;
		ob=new A();
		ob.test();//From test() B
		ob= new B();//Auto upcasting
		ob.test();//From test() B
		
		A ob2=new B();//Is a relationship,method overriding and Derived type casting
		ob2.test();//From test() B
		System.out.println("-----------\n For loops" );
		A[] array = { new A(),new B(),new A(),new B()};
		for (int i = 0; i < array.length; i++) 
		{
			array[i].test();
			System.out.println("-----------");
		}
		
		for(A obj:array)
		{
			obj.test();
			System.out.println("-----------");
		}
	}

}
