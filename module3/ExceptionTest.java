package module3;
import java.util.Scanner;
public class ExceptionTest {
	void display() throws ArithmeticException
	{	  
	         Scanner sc = new Scanner(System.in);
	         System.out.print("Enter a:");
				int a1 = sc.nextInt();
				System.out.print("Enter b:");
				int b1 = sc.nextInt();
				int div=a1/b1;
				System.out.print("res="+div);
				/*System.out.println("within Try block");
	      } catch (Exception e) {
	         System.out.println("Exception thrown  :" + e);
	    	 // System.out.println(e.getMessage());
	      }*/
	    System.out.println("Out of the try catch block");
	      System.out.println("My code is Safe");
  	}
	 public static void main(String args[]) {
	     ExceptionTest t=new ExceptionTest();
	     try {
	     t.display();}
	     catch(ArithmeticException e)
	     {
	    	 System.out.println(e); 
	     }
	   }

}
