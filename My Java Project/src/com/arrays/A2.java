//Create an array of size 10 and store all the numbers divisible by 8 starting ftrom 50

package com.arrays;

public class A2 {

	public static void main(String[] args)
	{
		int[] a=new int[10];//local array variable
		for (int i = 0,j=50; i < a.length; j++)
			//storing the array with multiples of 8
		{
			if(j%8==0)
			{
				a[i]=j;
				i++;
			}
		}
		//displaying the array
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Element at "+i+"th position is "+a[i]);
		
		}

	}

}
/*
 Element at 0th position is 56
Element at 1th position is 64
Element at 2th position is 72
Element at 3th position is 80
Element at 4th position is 88
Element at 5th position is 96
Element at 6th position is 104
Element at 7th position is 112
Element at 8th position is 120
Element at 9th position is 128
*/
