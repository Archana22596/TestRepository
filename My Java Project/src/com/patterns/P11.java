/*
A
BB
CCC
DDDD
EEEEE
*/

package com.patterns;

public class P11 
{

	public static void main(String[] args) 
	{
		int n=5;
		char ch='A';
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(i>=j)
					System.out.print(ch);
	
			}
			System.out.println();
			ch++;
			
		}
		

	}

}
