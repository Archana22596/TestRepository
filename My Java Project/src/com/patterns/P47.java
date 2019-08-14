/*
12345
 6789
  012
   34
    5
 
*/
package com.patterns;

public class P47 {

	public static void main(String[] args) 
	{
		int n=5,k=1;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(i<=j)
					System.out.print(k++%10);
				else
					System.out.print(" ");
				
			}
			System.out.println();

			
		}
		

	}

}
