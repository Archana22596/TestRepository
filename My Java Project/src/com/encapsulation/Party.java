package com.encapsulation;
import com.encapsulation.Voter;

public class Party {

	public static void main(String[] args) 
	{
		Voter v1=new Voter(30,04);
		System.out.println("Id: "+v1.getId());
		System.out.println("Age: "+v1.getAge());
		v1.setAge(150);
		v1.setAge(18);
		v1.setAge(12);
	}

}
