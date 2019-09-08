//To demonstrate method chaining
package methodChaining;

public class C {
	int i;
	int j;
	C()//non-parameterized constructor
	{}
	C(int i,int j)//Parameterized constructor
	{
		this.i=i;
		this.j=j;
	}
	static C generateObject(int i,int j)//static method to generate objects 
	{
		return new C(i,j);

	}
	C initialize(int i,int j)//method to initialize the values of the objects
	{
		this.i=i;
		this.j=j;
		return this;
	}
	void display()//non static method to display the parameters
	{
		System.out.println("i: "+this.i);
		System.out.println("j: "+this.j);
	}
	public static void main(String[] args) 
	{
		C ob = C.generateObject(10, 20);
		ob.display();
		ob.initialize(100, 200).display();

	}

}
