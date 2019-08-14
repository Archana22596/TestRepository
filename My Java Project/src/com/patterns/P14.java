/*
1
01
010
1010
10101
*/
package com.patterns;

public class P14 {

	public static void main(String[] args) 
	{
		int n=5,k=1;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(i>=j)
					System.out.print(k++%2);		
				
			}
			System.out.println();

			
		}
			
	}

}
