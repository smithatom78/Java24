package lab24;
import java.util.Scanner;

class Employee1 {
    String name, address;
    int age, mob;
    float sal;
    void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + mob);
         }

    // Method to print salary
    void printSalary() {
        System.out.print(sal);
    }
}

class Officer extends Employee1 {
    String specialization;

    // Method to print specialization
    void printSpecialization() {
        System.out.print(specialization);
    }

   }

class Manager extends Employee1 {
    String department;

    // Method to print department
    void printDepartment() {
        System.out.print(department);
    }
}

public class EmpInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Officer object
        Officer off = new Officer();
        System.out.println("Enter the officer's name:");
        off.name = sc.nextLine();
        System.out.println("Enter Address:");
        off.address = sc.nextLine();
        System.out.println("Enter Specialization:");
        off.specialization = sc.nextLine();
        System.out.println("Enter Age:");
        off.age = sc.nextInt();
        System.out.println("Enter Phone Number:");
        off.mob = sc.nextInt();
        System.out.println("Enter Salary:");
        off.sal = sc.nextFloat();
        sc.nextLine();  // Consume the leftover newline

        // Create Manager object
        Manager man = new Manager();
        System.out.println("Enter the manager's name:");
        man.name = sc.nextLine();
        System.out.println("Enter Address:");
        man.address = sc.nextLine();
        System.out.println("Enter Department:");
        man.department = sc.nextLine();
        System.out.println("Enter Age:");
        man.age = sc.nextInt();
        System.out.println("Enter Phone Number:");
        man.mob = sc.nextInt();
        System.out.println("Enter Salary:");
        man.sal = sc.nextFloat();

        // Display details
  
        System.out.println("OFFICER DETAILS:");
        off.printEmployee();
        //System.out.println();
        System.out.print("Salary: ");
        off.printSalary();
        System.out.println();
        System.out.print("Specialization: ");
        off.printSpecialization();
        System.out.println();
        System.out.println();
        System.out.println("MANAGER'S DETAILS:");
        man.printEmployee();
        System.out.print("Salary: ");
        man.printSalary();
        System.out.println();
        System.out.print("Department: ");
        man.printDepartment();
        System.out.println();
              
    }
}
