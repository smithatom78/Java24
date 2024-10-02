package Rem24;
import java.util.Scanner;

public class RemFirsLast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input string from the user
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        
        // Check if the string is empty or has only one character
        if (input == null || input.length() <= 1) {
            // Print the string as is if it's null or has 1 or fewer characters
            System.out.println("Processed string: " + input);
        } else {
            // Get the first and last characters
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(input.length() - 1);
            
            if (firstChar == lastChar) {
                // If the first and last characters are the same, remove both
                String result = input.substring(1, input.length() - 1);
                System.out.println("Processed string: " + result);
            } else {
                // If the first and last characters are different, remove both
                String result = input.substring(1, input.length() - 1);
                System.out.println("Processed string: " + result);
            }
        }
        
        sc.close(); // Close the scanner
    }
}
