//Write a program to design a method which can perform the addition of two values
package com.primitivetypecasting;

public class T2
{
 public static void Add(double a ,double b)
 {
	double sum=a+b;
	System.out.println("Sum of"+a+"and"+b+"is"+sum);
 }
 public static void main(String[] args) 
  {
	 Add(10.0,'a');
	 Add(10.0,12.3);
	 Add('a','b');
	 Add(10.0f,2);
	
}
}
/* 
Sum of10.0and97.0is107.0
Sum of10.0and12.3is22.3
Sum of97.0and98.0is195.0
Sum of10.0and2.0is12.0
*/
