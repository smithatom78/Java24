package module3;
//An example to show that interfaces can
//have methods from JDK 1.8 onwards
interface In1
{	final int a = 10;
	 void display1();
	default void display()
	{
		System.out.println("hello");
		
	}
	
}
class TestClass1 implements In1
{public void display1()
	{
	System.out.println("hello from ABSTRACT METHOD");
	}
}
//A class that implements the interface.
class TestClass 
{
	// Driver Code
	public static void main (String[] args)
	{
		TestClass1 t = new TestClass1();
		t.display();
		t.display1();
	}
}
