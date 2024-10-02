package module3;
import java.util.Scanner;
public class ExcepTest {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
		try{
		System.out.println("Program to perform Division");
			System.out.print("Enter Number-1:");
			int a = sc.nextInt();
			System.out.print("Enter Number-2:");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Result="+c);
			System.out.println("End of Try block");
				}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("finally block content");
		}
		System.out.println("My code is safe from exception");
		 System.out.println("Do you want to continue y or n");
		    String co = sc.next();
		   if(co.equalsIgnoreCase("n")){ 
		      break;
		     }
		}
	}
}
