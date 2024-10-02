package Rem24;
import java.util.Scanner;

public class Multiplicationtable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        System.out.println("Enter the limit:");
        int limit = sc.nextInt();

        // Print the multiplication table
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}