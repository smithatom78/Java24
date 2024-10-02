package module2;
class Base1 {
	  public  void show() {
	       System.out.println("Base::show() called");
	    }	}
	class Derived1 extends Base1 {
	    public void show() {  
	       System.out.println("Derived::show() called");
	    }}
	public class Main {
	    public static void main(String[] args) {
	        Base1 b = new Derived1();;
	        b.show();
	    }}