package com.assignments;

public class DisplayEven 
{
	public static void displayEven(int a,int b)
	{
	while(a<=b)
	{
	if(a%2==0)
	System.out.println(a);
	a++;
	}
	}
	public static void main(String[] args) 
	{
	displayEven(12,20);

	}

}
