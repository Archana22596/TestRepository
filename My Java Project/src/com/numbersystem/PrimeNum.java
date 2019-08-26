//to check and display whether the given number is prime or not?
package com.numbersystem;

	public class PrimeNum {

	public static void main(String[] args) 
	{
	int n=256;boolean isprime=true;
	for(int i=2;i<=n-1;i++)
	{
	if(n%i==0)
	{
	isprime=false;
	}
	}
	if(isprime==true)
	{
	System.out.println(n +" is prime number");
	}
	else
	System.out.println(n +" not prime number");

	}

	}
	/*
	  OUTPUT:
	  256 not prime number
	 */
