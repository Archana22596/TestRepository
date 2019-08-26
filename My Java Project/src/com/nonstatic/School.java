//To create class comapny
package com.nonstatic;

public class School 
{

	public static void main(String[] args)
	{
		Student s1 =new Student();
		Student s2 =new Student();
		System.out.println("Student name:"+s1.name+"    Student marks:"+s1.marks);
		System.out.println("Student name:"+s2.name+"    Student marks:"+s2.marks);
		s1.name="Chucu";
		s1.marks=99;
		s2.name="Ammu";
		s2.marks=88;
		System.out.println("Student name:"+s1.name+"   Student marks:"+s1.marks);
		System.out.println("Student name:"+s2.name+"    Student marks:"+s2.marks);
	}

}

/*
Student name:null    Student marks:0
Student name:null    Student marks:0
Student name:Chucu   Student marks:99
Student name:Ammu    Student marks:88
*/
