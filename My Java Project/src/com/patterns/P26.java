/*
12345
6789
012
34
5
*/
package com.patterns;

public class P26
{

	public static void main(String[] args) 
	{
		{
			int n=5,k=1;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++) 
				{
					if(i+j<=n-1)
						System.out.print(k++%10);		
					
				}
				System.out.println();

				
			}
		}
	}

}
