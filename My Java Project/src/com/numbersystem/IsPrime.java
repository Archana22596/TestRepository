//to check and display whether the given number is prime or not?
package com.numbersystem;

public class IsPrime
{
		public static void main(String[] args) 
	{
	int n=7;
	int count=0;
	for(int i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	count++;
	}
	}
	if(count==2)
	System.out.println(n + " is prime number");
	else
	System.out.println(n + "is not prime number");

	}

}

	/*
	OUTPUT:
	7 is prime number
	*/



