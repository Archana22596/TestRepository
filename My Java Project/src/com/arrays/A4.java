//WAP to create an array pf sixe 5 and store all the numbers divisible by 5 starting from 0.Create another array and copy all the elements of the previous array to this array and dispay the elements that are present at odd indices
package com.arrays;

public class A4 
	{
		public static void main(String[] args)
		{
			int[] a=new int[5];//local array variable
			for (int i = 0,j=0; i < a.length; j++)
				//storing the array with multiples of 2
			{
				if(j%5==0)
				{
					a[i]=j;
					i++;
				}
			}
			//displaying the array
			System.out.println("Elements of the array are");
			for (int i = 0; i < a.length; i++)
			{

				System.out.println(a[i]);
			
			}
			
			int[] b=new int[5];
			for (int i = 0; i < a.length; i++)
			{
					b[i]=a[i];
			
			}
			System.out.println("The Elements of Copied array are");
			for (int i = 0; i < a.length; i++)
			{

				System.out.println(b[i]);
			
			}
			//displaying the elements at odd indices
			System.out.println("Elements at odd indices are");
			for (int i = 0; i < a.length; i++)
			{
				if(i%2==1)
				System.out.println(b[i]);
			
			}


		}

	}


