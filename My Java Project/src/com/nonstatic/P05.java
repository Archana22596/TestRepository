//Assessing non static member from a static method ans using this keyworld
package com.nonstatic;

public class P05
{
	int i;
	void test()
	{
		int i=30;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) 
	{
		P05 ob1=new P05();
		ob1.test();
		P05 ob2=new P05();
		ob2.i=20;
		ob2.test();
		
	}

}
/*
30
0
30
20
*/