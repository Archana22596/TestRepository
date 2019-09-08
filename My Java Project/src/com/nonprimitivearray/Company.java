package com.nonprimitivearray;

public class Company 
{

	public static void main(String[] args)
	{
		Employee[] e= new Employee[4];
		e[0]=new Employee(1,"Sherkhan",2);
		e[1]=new Employee(2,"Bhagira",3.5);
		e[2]=new Employee(3,"Bhalu",4.5);
		e[3]=new Employee(4,"mowgly",9.5);
	
	for(int i = 0; i < e.length;i++)
		{
		System.out.println("name is: "+e[i].name+"  id is: "+e[i].id+"  salary is: "+e[i].salary);	
		}
	}

}
