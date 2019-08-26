//Sample program using static initializer block
package com.staticmembers;

public class S13 {
	static int i;
	static
	{
		System.out.println(i);
		i=30;
	}
	public static void main(String[] args)
	{
		System.out.println(i);//20
		
	}

}
/*
0
20
*/