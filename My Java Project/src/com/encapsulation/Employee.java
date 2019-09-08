package com.encapsulation;

public class Employee
{
String name;
int id;
private double salary;
public  double getSalary()
{
	return salary;

}
public void setSalary(double salary)
{
	if(salary>this.salary)
		this.salary=salary;
	else
		System.out.println("Entered salary is unacceptable");
}

public Employee(String name,double salary,int id)
{
	this.name=name;
	this.salary=salary;
	this.id=id;
	
}
}
