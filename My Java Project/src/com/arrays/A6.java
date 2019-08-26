package com.arrays;

public class A6 
{
	public static void main(String[] args)
	{
		int[] a=new int[5];//local array variable
		for (int i = 0; i < a.length; i++)
		{
				a[i]=i;
			
		}
		System.out.println("Elements of the array are");
		for (int i = 0; i < a.length; i++)
		{

			System.out.println(a[i]);
		}
		int[] b=new int[5];
		for (int i = 0; i < b.length; i++)
		{
		b[i]=a[i];
		}
		System.out.println("Elements of the array in reverse order are");
		for (int i = b.length-1; i>=0; i--)
		{

			System.out.println(b[i]);	
		}
	
			

	}
}
