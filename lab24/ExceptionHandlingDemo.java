package lab24;
import java.util.Scanner;
import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Demonstrate ArithmeticException");
            System.out.println("2. Demonstrate ArrayIndexOutOfBoundsException");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    demonstrateArithmeticException();
                    break;
                case 2:
                    demonstrateArrayIndexOutOfBoundsException(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            scanner.nextLine();
            String continueChoice = scanner.nextLine().trim().toLowerCase();

            if (!continueChoice.equals("yes")) {
                System.out.println("Exiting the program.");
                scanner.close();
                return;
            }
        }
    }

    private static void demonstrateArithmeticException() {
        System.out.println("Demonstrating ArithmeticException:");
        try {
            System.out.print("Enter the numerator: ");
            Scanner scanner = new Scanner(System.in);
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("Exiting ArithmeticException demonstration.");
        }
    }

    private static void demonstrateArrayIndexOutOfBoundsException(Scanner scanner) {
        System.out.println("Demonstrating ArrayIndexOutOfBoundsException:");
        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            
            System.out.println("Enter " + size + " elements for the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            
            System.out.print("Enter an index to access : ");
            int index = scanner.nextInt();
            
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Exiting ArrayIndexOutOfBoundsException demonstration.");
        }
    }
}
