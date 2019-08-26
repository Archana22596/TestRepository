//Sample program for static methods
package com.staticmembers;

public class S8 {
	static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		test();//Directly call the method
		System.out.println("++++++");
		S8.test();//By using class name
		System.out.println("Main ends");

	}

}
/*Main starts
from test
++++++
from test
Main ends
*/
