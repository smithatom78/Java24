package module3;
abstract class Animal{
	protected int legs;
	protected Animal(int legs)
	{
		this.legs=legs;
	}
	public void walk()
	{
		System.out.println("This animal walk by "+legs+" legs.");
		}
	public abstract void eat();
}
interface Pet{
	 public String getName();
	 public void setName(String name);
	 public void play();
}
class Spider extends Animal 
{
	public Spider()
	{
		super(8);
		}
	public void eat()
	{
		System.out.println("Spider eat insects");
		}
}
 
class Cat extends Animal implements Pet {
	 private String catName;
	 public Cat(){
		 this("");
	 }
	 public Cat(String name){
		 super(4);
		 catName=name;
	 }
	public void eat() 
	 {
		 System.out.println("Cat eat fishes");
		 }
	 public String getName() 
	 {
		 return catName;
		 }
	 public void setName(String name) {
		 catName=name;
	 }
	 public void play() {
		 System.out.println("Cat play with rats");
		 }
 }
class Fish extends Animal implements Pet {
	public Fish()
	{
		super(0);
		}
	private String fishName; 
		public void eat() {
		System.out.println("Fish eat plants");
		}
	public String getName() 
		{
			return fishName;
			}
		public void setName(String name) {
			fishName = name;
			}
		public void play() {
			System.out.println("Fish plays in water");
			}
		public void walk(){
			System.out.println("Fish has no legs.");
			}
}
public class Anim{
	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat(" Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		System.out.println("\nFISH");
		d.setName(" Mimi");
		System.out.println("This fish's name is"+d.getName());
		d.eat();
		d.walk();
		d.setName(" Momo");
		System.out.println("This fish's name is"+d.getName());
		
		System.out.println("\nCAT");
		System.out.println("This cat's name is"+c.getName());
		c.walk();
		c.play();
		c.eat();
		p.setName("Moose");
		System.out.println("This cat's name is"+p.getName());
		System.out.println("\nSPIDER");
		e.eat();
		e.walk();
		
	
		}

	}


