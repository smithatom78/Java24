package module1;
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full Name:");
        String fname = sc.nextLine();

        System.out.println("Enter the age:");
        int age = sc.nextInt();

        // Consume the newline character left behind by nextInt()
       // sc.nextLine(); // Consume newline

     

        System.out.println("Enter the Mobile Number:");
        long mobileNo = sc.nextLong();

        System.out.println("Enter the cgpa:");
        double cgpa = sc.nextDouble();

        // Output the collected information
     
        System.out.println("Age: " + age);
        System.out.println("Full Name: " + fname);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);

        sc.close();
    }
}
