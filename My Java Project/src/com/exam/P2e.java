/*0
10
101
0101
*/
package com.exam;

public class P2e {
	public static void main(String[] args)
	{
		int n=4,k=0;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n ; j++)
			{
				if(i>=j)
					System.out.print(k++%2);
			}
			System.out.println();
			
		}
	}

}
