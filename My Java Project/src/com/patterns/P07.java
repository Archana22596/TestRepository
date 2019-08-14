
/*
1
22
333
4444
55555
*/

package com.patterns;

public class P07 
{

	public static void main(String[] args)
	{
		int n=5,k=1;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(i>=j)
					System.out.print(k);
			}
			System.out.println();
			k++;
		}
 
	}

}
