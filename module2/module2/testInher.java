package module2;
import java.util.Scanner; 
//A Simple Java program to demonstrate
//method overriding in java

//Base Class
class Parent {
	void show()
	{
		System.out.println("Parent's show()");
	}
}

//Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	@Override
	void show()
	{
		System.out.println("Child's show()");
	}
}

//Driver class
class testInher{
	public static void main(String[] args)
	{
	
		Parent obj1 = new Parent();
		obj1.show();
		Parent obj2 = new Child();
		obj2.show();
		Child obj3 = new Child();
		obj3.show();
	}
}
