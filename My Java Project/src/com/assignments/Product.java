package com.assignments;

public class Product {
	public static void mul(int a ,int b)
	{	int pro=a*b; 
		System.out.println("The Product of "+a+" and "+b+" is "+pro);
	}
	public static void mul(double d,double e,double f)
	{
		double pro=d*e*f;
		System.out.println("The Product of "+d+" and "+e+" and "+f+" is "+pro);

	}
	public static void mul(int a,int b,int c)
	{
	    int  pro=a*b*c;
		System.out.println("The Product of "+a+" and "+b+" and "+c+" is "+pro);

	}
	public static void main(String[] args) 
	{
	mul(1,2);	
	mul(1,2,3);
	mul(1.0,2.4,3.0);
	}

}
