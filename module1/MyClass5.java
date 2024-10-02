package module1;

 class MyClass {
	int var1;
	//no-arg constructor
	MyClass()
	{var1=10;	}
	//parameterized constructor
	MyClass(int num)
	{var1=num;}
	int getvalue()
	{return var1; } }


	public class MyClass5 {
	public static void main(String args[])
	{MyClass m=new MyClass();
	System.out.println("VAR1= "+m.getvalue());
	MyClass m1=new MyClass(25);
	System.out.println("VAR2= "+m1.getvalue());
	}

}
