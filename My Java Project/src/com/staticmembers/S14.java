//Local variables in a static block cannot be accessed globally
package com.staticmembers;

public class S14 {
	static 
	{
		int i=20;
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
		System.out.println("From main");		
		//System.out.println(i); Compile time error
	}

}
