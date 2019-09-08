package com.constructor;

public class P8
{	
	boolean x;
	double y;
	P8(boolean x, double y)
	{
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args)
	{
		P8 ob1 =new P8(false,2.2);
		P8 ob2 =new P8(true,3.7);
		P8 ob3 =new P8(false,0.2);
		System.out.println("x:"+ob1.x+"   y: "+ob2.y);
		System.out.println("x:"+ob2.x+"    y: "+ob2.y);
		System.out.println("x:"+ob3.x+"   y: "+ob3.y);

	}

}
/*
x:false   y: 3.7
x:true    y: 3.7
x:false   y: 0.2
*/