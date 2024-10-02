package lab24;

import java.util.Scanner;

class Employee {
    
    public void display() {
        System.out.println("Name of class is Employee.");
    }
    public void calcSalary() {
        System.out.println("Salary of employee is 10000.");
    }
}
class Engineer extends Employee {
 
    public void calcSalary() {
    	        System.out.println("Salary of engineer is 20000.");
    }

}

public class InheritanceDemo {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Name of the employee");
			String name=sc.nextLine();
			System.out.println("Enter the salary of the employee");
			int salary=sc.nextInt();
	        Engineer engineer = new Engineer();
	        engineer.display(); 
	        engineer.calcSalary(); 
	        }

}
