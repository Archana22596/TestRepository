//Pragram to understand the primitive type casting
package com.primitivetypecasting;

public class T1 
{

	public static void main(String[] args)
	{
		char a ='f';
		int b=a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+2);
		
		int i=10;
		double d=(double)i;//use of caste operator is not mandatory
		System.out.println(i);
		System.out.println(d);
		System.out.println(i+20.0);
		
		int j=10;
		System.out.println(j/2.0);
		System.out.println(j+2.0);
		
		int k=12;
		float l=2.0f;
		float y=k/l;
		System.out.println(y);
		
	}

}
/*
f
102
104
10
10.0
30.0
5.0
12.0
*/
