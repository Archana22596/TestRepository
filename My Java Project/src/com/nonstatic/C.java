package com.nonstatic;

public class C {
	int a ;
	void m1()
	{
		int a=300;
		System.out.println(this.a);//accessing non-static variable from a non-static method
		this.a=a;//reassigning the value of static a
		System.out.println(a);//accessing the variable directly
		System.out.println(this.a);//accessing the variable by using the this keyword
	}

	public static void main(String[] args) 
	{
		C ob1=new C();//ob1 creation
		ob1.a=20;
		ob1.m1();
		C ob2=new C();//creation of object ob2
		System.out.println(ob2.a);
		ob2.a=30;
		System.out.println(ob2.a);
		ob2.m1();

	}

}
/*
20
300
300
0
30
30
300
30
*/
