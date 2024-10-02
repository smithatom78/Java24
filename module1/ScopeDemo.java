package module1;

/**
* The ScopeDemo program implements an application that
* simply demonstrates scope of the variables in Java Program .
*
* @author  Smitha Jacob
* @version 1.0
* @since   2021-11-16 
*/

public class ScopeDemo {
	static int a=5;
	public static void main(String[] args) {
		int x; // known to all code within main
	
		x = 10;
		if(x == 10) { // start new scope
			int y = 20; // known only to this block
			// x and y both known here.
			System.out.println("x and y: " + x + " " + y);
			System.out.println("a: " + a);
			x = y * 2;
		}
	//	y = 100; // Error! y not known here
		// x is still known here.
		System.out.println("x is " + x);
		System.out.println("a again: " + a);
	}
}
