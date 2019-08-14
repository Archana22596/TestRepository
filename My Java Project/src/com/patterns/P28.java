/*
            01 
         02 03 
      04 05 06 
   07 08 09 10 
11 12 13 14 15  
*/
package com.patterns;

public class P28 
{

	public static void main(String[] args) 
	{
		int n=5,k=01;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(i+j>=n-1)
				{
					if(k<10)
					System.out.print("0"+k+++" ");
					else
						System.out.print(k+++" ");
				}
				else
					System.out.print("   ");
				
			}
			System.out.println();
			
		}
	}

}
