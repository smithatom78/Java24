package m1;
import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        // Close the scanner
        scanner.close();
        // Convert the input string to a character array
        char[] characters = input.toCharArray();
        // Check for duplicate characters
        boolean[] checked = new boolean[characters.length];
        boolean foundDuplicate = false; // Flag to track if duplicates are found
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < characters.length; i++) {
            if (checked[i]) continue; // Skip already checked characters
            int count = 1; // Initialize count for the current character
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    count++;
                    checked[j] = true; // Mark this character as checked
                }
            }
            // Print the character if its count is greater than 1
            if (count > 1) {
                System.out.println(characters[i] + "-" + count + " times");
                foundDuplicate = true; // Set the flag to true if duplicates are found
            }
        }
        // If no duplicates were found, print a message
        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }
    }
}
