//Creating a class company with employee as object and creating a object
package com.nonstatic;

public class Company {

	public static void main(String[] args)
	{
		Employee e1;
		e1=new Employee();
		System.out.println("Employee name:"+e1.name+"  id: "+ e1.id);
		Employee e2=new Employee();
		System.out.println("Employee name:"+e2.name+"  id: "+ e2.id);
		e2.name="Chikki";
		e2.id=1;
		System.out.println("Employee name:"+e2.name+"  id: "+ e2.id);
		Employee e3=new Employee();
		e3.name="Chikku";
		e3.id=2;
		System.out.println("Employee name:"+e3.name+"  id: "+ e3.id);
		
	
	}

}
/*
Employee name:null  id: 0
Employee name:null  id: 0
Employee name:Chikki  id: 1
Employee name:Chikku  id: 2
*/
