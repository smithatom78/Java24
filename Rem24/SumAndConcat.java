package Rem24;

	import java.util.Scanner;

	public class SumAndConcat {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String continueChoice;

	        do {
	            // Prompt user to choose operation
	            System.out.println("Choose an operation:");
	            System.out.println("1. Add two integers");
	            System.out.println("2. Concatenate two strings");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    // Read two integers and perform addition
	                    System.out.println("Enter the first integer:");
	                    int firstNumber = sc.nextInt();
	                    System.out.println("Enter the second integer:");
	                    int secondNumber = sc.nextInt();
	                    int sum = firstNumber + secondNumber;
	                    System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
	                    break;

	                case 2:
	                    // Read two strings and perform concatenation
	                    System.out.println("Enter the first string:");
	                    String firstName = sc.next();
	                    System.out.println("Enter the second string:");
	                    String lastName = sc.next();
	                    String fullName = firstName + " " + lastName;
	                    System.out.println("The concatenated name is " + fullName);
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	                    break;
	            }

	            // Ask if the user wants to continue
	            System.out.println("Do you want to perform another operation? (yes/no)");
	            continueChoice = sc.next();

	        } while (continueChoice.equalsIgnoreCase("yes"));

	        sc.close();
	        System.out.println("Program terminated.");
	    }
	}
