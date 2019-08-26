//WAP to create an array of size 5 and store the first five natural numbers.Display thr elemnets of the array in reverse order.
package com.arrays;

public class A5 {
	public static void main(String[] args)
	{
		int[] a=new int[5];//local array variable
		for (int i = 0,j=0; i < a.length; j++)
			//storing the array with multiples of 2
		{
				a[i]=j;
				i++;
		}
		//displaying the array
		System.out.println("Elements of the array are");
		for (int i = 0; i < a.length; i++)
		{

			System.out.println(a[i]);
		
		}
		System.out.println("Elements of the array in reverse order are");
		//display the rray in reverse order
		for (int i = a.length-1; i>=0; i--)
		{

			System.out.println(a[i]);
		
		}
	}
}
