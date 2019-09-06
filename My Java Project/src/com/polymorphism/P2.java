package com.polymorphism;

public class P2 extends P1
{
	void bulletPrakash()
	{
		System.out.println("From Bullet prakash of P2");
		
	}
	static void klRahul()
	{
		System.out.println("From KLRahul of P2");
	}

	public static void main(String[] args) 
	{
		P1.klRahul();//From KLRahul of P1
		P2.klRahul();//From KLRahul of P2
		P1 ob1=new P2();
		ob1.klRahul();//From KLRahul of P1
		ob1.bulletPrakash();//From Bullet prakash of P2
		P1 ob2=new P1();
		ob2.klRahul();//From KLRahul of P1
		ob2.bulletPrakash();//From Bullet prakash of P1
		P2 ob3=new P2();
		ob3.klRahul();//From KLRahul of P2
		ob3.bulletPrakash();//From Bullet prakash of P2	
		
	}

}
