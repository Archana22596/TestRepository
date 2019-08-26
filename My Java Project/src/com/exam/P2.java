/*
EDCBA
DCBA
CBA
BA
A*/
package com.exam;

public class P2 {

	public static void main(String[] args)
	{
		int n=5,l=4;
		char k='E';
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n ; j++)
			{
				if(i+j<=n-1)
					System.out.print(k--);
			}
			System.out.println();
			k=(char) (k+(l-i));
					
			
		}
		

	}

}
