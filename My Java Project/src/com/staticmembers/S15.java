//Acessing local variable present locally and static variables in different class
package com.staticmembers;

public class S15 
{
  static int i=10;
  static
  {
	  int i=20;
	  System.out.println(i);//20
	  System.out.println(S13.i);//20
  }
  public static void main(String[] args) 
	{
		System.out.println(i);//10	
	}
}
/*
20
0
30
10
*/