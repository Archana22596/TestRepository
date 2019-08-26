// WAP to create an array pof size 10 and store all the even numbers starting from 10 then display the array elements which are present at the index positions which are multiples of 3
package com.arrays;

public class A3 
{
		public static void main(String[] args)
		{
			int[] a=new int[10];//local array variable
			for (int i = 0,j=10; i < a.length; j++)
				//storing the array with multiples of 2
			{
				if(j%2==0)
				{
					a[i]=j;
					i++;
				}
			}
			//displaying the array
			for (int i = 0; i < a.length; i++)
			{
				if(i%3==0)
				System.out.println(a[i]);
			
			}

		}

	}
/*
10
16
22
28
 */

