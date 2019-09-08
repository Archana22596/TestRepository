package com.encapsulation;

public class Voter 
{
	private int age;
	private int id;
	public int getAge()
	{
		return age;

	}
	public int getId()
	{
		return id;
	}
	public void setAge(int age)
	{
		if(age>=18 && age<130)
		{
			this.age=age;
			System.out.println("Age is "+this.age+" And you are eligible to vote");
		}
		else if(age>130)
		{
			System.out.println("You are about to die.Take rest");
		}
		else
			System.out.println("You are not eligible to vote");
	}
	
	public void setId(int id)
	{
		this.id=id;
	}

	public Voter(int age,int id)
	{
		this.age=age;
		this.id=id;
		
	}

}
