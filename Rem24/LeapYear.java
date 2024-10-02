package Rem24;
import java.util.Scanner;
public class LeapYear{

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
        // Prompt user to enter a year
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        // Check if the year is a leap year
        boolean isLeapYear;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        System.out.println("Do you want to check another year? (Y/N)");
        choice = sc.next();

    } while (choice.equalsIgnoreCase("Y"));
        System.out.println("program terminated");
        sc.close();
    }
}
