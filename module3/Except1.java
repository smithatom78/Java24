package module3;
import java.util.Scanner;
public class Except1 {
	 public static void main(String args[]) {
		 int a[] = new int[2];
	      try {//a[1]=3;
	    	  System.out.println("Accessing  elements from Array A");
	         System.out.println("Access element three :" + a[3]);
	        
	      } catch (Exception e) {
	         System.out.println("Exception thrown  :" + e);
	      }
	      finally {
	          a[0] = 6;
	          System.out.println("First element value: " + a[0]);
	          System.out.println("The finally statement is executed");
	       }
	      System.out.println("Out of the block");
	      }
}
