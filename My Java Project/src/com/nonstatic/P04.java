//To understand non static methods
package com.nonstatic;

public class P04
{
	int i;
	void test()
	{
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		P04 ob=new P04();
		ob.i=10;
		ob.test();

	}

}
/*Output
  10
*/