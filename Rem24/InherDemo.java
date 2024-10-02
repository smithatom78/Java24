package Rem24;
class Animal
{
	void eat()
	{
		System.out.println( "eating...");
	}  
}
class Dog extends Animal
{  String dogname;
	Dog(String dogname)
	{
		this.dogname=dogname;
	}
	void bark()
	{
	System.out.println(dogname + " is barking...");
	} 
}
public class InherDemo {
	public static void main(String args[])
	{  
		Dog d=new Dog("COCO");  
		d.bark();  
		d.eat();  
	}
}







