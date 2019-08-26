/*
1
10
101
1010
*/
package com.exam;

public class A3e {
	public static void main(String[] args)
	{
		int n=4;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n ; j++)
			{
				if(i>=j)
				{
					if(j%2==0)
					System.out.print(1);
					else
						System.out.print(0);
				}
			}
			System.out.println();
			
		}
	}


}
