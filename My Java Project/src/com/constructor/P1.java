//Sample program for understanding constructor.Constructor executes during the object creation of the class 
package com.constructor;

public class P1
{
	P1()//User defined Non-parametrized
	{
		System.out.println("From constructor of P1");
	}
	public static void main(String[] args)
	{
		System.out.println("From main");
		P1 ob=new P1();//From constructor of P1
		System.out.println(new P1());//From constructor of P1

	}

}
/*From main
From constructor of P1
From constructor of P1
com.constructor.P1@15db9742
*/