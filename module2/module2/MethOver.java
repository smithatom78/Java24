package module2;
class Human{
	   //Overridden method
	   public void eat()
	   {
	System.out.println("Human is eating");
	   }
	}
	class Boy extends Human{
	   //Overriding method
	   public void eat(){
	 System.out.println("Boy is eating");
	 }
	}
	public class MethOver {
	public static void main( String args[]){
	  Boy obj = new Boy();
	  Human  obj1 = new   Human();  
	  //This will call the child   class version of eat()
	      obj.eat();
	      obj1.eat();
	   }

	}
