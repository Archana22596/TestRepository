//Demonstration for method chaining
package methodChaining;

public class B {
	int i;
	public B initialize(int i)
	{
		this.i=i;
		return this;
	}
	public static B createObject()
	{
		return new B();
	}
	public B display()
	{
		System.out.println(("i:"+this.i));
		return this;
	}
	public static void main(String[] args) 
	{
		B.createObject().display().initialize(10).display();
	}

}
