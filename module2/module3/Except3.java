package module3;
import java.util.Scanner;
public class Except3 {
	 public static void main(String args[]) {
	          Scanner sc = new Scanner(System.in);
	          System.out.print("Enter a:");
				int a1 = sc.nextInt();
				System.out.print("Enter b:");
				int b1 = sc.nextInt();
				if (b1 == 0) {
					
		            throw new ArithmeticException("Division by zero is not allowed.");
		           
				}
				 try { 
					 
					 int div=a1/b1;
					 System.out.println("res="+div);
					 System.out.println("in try block");
	              }
				 catch (ArithmeticException e)
				 {System.out.println("Exception thrown  :" + e);
				 }
	           System.out.println("Welcome to Java Exception");
	           System.out.println("Thank u");
	        }}
