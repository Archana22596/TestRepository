//WAP to create method known as display to display the elements of an array 
package com.array2;

public class A2 {
	static void display(int[] a)
	{
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
		

	public static void main(String[] args) 
	{
		int[] array = new int[5];
		for(int i = 0;i<array.length;i++)
		{
			array[i]=i+1;
		}
		display(array);

	}

}
