//To understand teh usage of non static methods and usage of this keyword
package com.nonstatic;

public class P03 {
	int i;
	void test()   //called method
	{
		System.out.println("from test");
		System.out.println(i);
		System.out.println("this: "+this);
		i=20;
		System.out.println(this.i);
		System.out.println("end of the test");
		
	}

	public static void main(String[] args)  // calling method
	{
		System.out.println("from main");
		P03 ob=new P03();
		ob.i=10;
		ob.test();
		//System.out.println(this);Compile time error
		System.out.println("ob: "+ob);
		System.out.println("end main");
	}

}
