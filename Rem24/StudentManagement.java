package Rem24;
import java.util.Scanner;
 class Student {
    private int rollNo;
    private int mark1;
    private int mark2;
    private int mark3;
    private double total;
    private double average;

    // Constructor to initialize a Student object
    public Student(int rollNo, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        calculateTotalAndAverage();
    }

    // Calculate total and average
    private void calculateTotalAndAverage() {
        this.total = mark1 + mark2 + mark3;
        this.average = this.total / 3;
    }

    // Method to get student details as a formatted string
    public String getDetails() {
        return String.format("%d\t%d\t%d\t%d\t%.2f\t%.2f", rollNo, mark1, mark2, mark3, total, average);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int no = sc.nextInt();
        Student[] students = new Student[no];

        for (int i = 0; i < no; i++) {
            System.out.println("Enter Roll No for student " + (i + 1) + ":");
            int rollNo = sc.nextInt();
            System.out.println("Enter mark in subject 1:");
            int mark1 = sc.nextInt();
            System.out.println("Enter mark in subject 2:");
            int mark2 = sc.nextInt();
            System.out.println("Enter mark in subject 3:");
            int mark3 = sc.nextInt();

            students[i] = new Student(rollNo, mark1, mark2, mark3);
        }

        System.out.println("Rno\tMark1\tMark2\tMark3\tTotal\tAverage");
        for (int i = 0; i < no; i++) {
            System.out.println(students[i].getDetails());
        }
    }
}
