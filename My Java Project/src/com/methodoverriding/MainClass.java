package com.methodoverriding;

public class MainClass {

	public static void main(String[] args)
	{
		B ob1= new B();
		ob1.test();//From test() of B  = Method overriding
		A ob2=new A();
		ob2.test();//From test() of B// No method overriding


	}

}
