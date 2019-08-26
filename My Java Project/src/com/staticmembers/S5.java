//To acess static variable when the local and globlal variable have the same name
package com.staticmembers;

public class S5 {
	static int a =10;
	public static void main(String[] args)
	{
		int a=20;
		System.out.println(a);//20
		System.out.println(S5.a);//10
		
	}

}
