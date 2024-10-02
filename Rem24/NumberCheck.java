package Rem24;
import java.util.Scanner;
public class NumberCheck {
	    public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	         String choice;

	         do {
	             // Prompt user to enter a number
	             System.out.println("Enter a number:");
	             double number = sc.nextDouble();

	             // Check if the number is positive, negative, or zero
	             if (number > 0) {
	                 System.out.println("The number is positive.");
	             } else if (number < 0) {
	                 System.out.println("The number is negative.");
	             } else {
	                 System.out.println("The number is zero.");
	             }

	             // Ask if the user wants to continue
	             System.out.println("Do you want to check another number? (yes/no)");
	             choice = sc.next();

	         } while (choice.equals("yes"));

	         sc.close();
	         System.out.println("Program terminated.");
	     }
	 }