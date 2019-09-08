package com.nonprimitivearray;

public class Demo {

	public static void main(String[] args) {
		Songs[] s= {new Songs("teri meri",4.2,"RFAK"),new Songs("meri kahani",4.8,"Arjith")};
		for(Songs s2:s)
		{
			System.out.println("title:"+s2.title);
			System.out.println("duration:"+s2.duration);
			System.out.println("singer"+s2.singer);
		}

	}

}
