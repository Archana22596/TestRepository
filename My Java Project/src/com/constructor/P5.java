package com.constructor;

public class P5 {
	int j;
	static int i;
	P5()		//constructor is a non static context
	{
		i=10;	//accessing static member directly
		System.out.println(P5.i);//10//accessing static member using class name
		System.out.println(j);//0//accessing non static member directly
		j=20;
		System.out.println(this.j);//20//accessing non-static member using this
		System.out.println(this);//P6@10000
	}
	

	public static void main(String[] args) {
		//System.out.println(i);//0
		P5 ob = new P5();
		System.out.println(ob.j);
	}

}
/*
10
0
20
com.constructor.P5@15db9742
20
*/