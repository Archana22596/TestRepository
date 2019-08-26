//calling a non-static method from static methof
package com.nonstatic;

public class P02 
{
	 void test()
{
	System.out.println("From test");
}

public static void main(String[] args) 
{
	System.out.println("Main starts");
	P02 ob1=new P02();
	ob1.test();
	System.out.println("Main ends");
}
}
/*
Main starts
From test
Main ends*/
