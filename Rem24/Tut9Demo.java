package Rem24;
import java.util.Scanner; 
abstract class Employee {
    protected String name;
    protected String type;
 Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }
String getName() {
        return name;
    }

abstract double calculateMonthlySalary();
}
class FullTimeEmployee extends Employee {
	    private double monthlySalary;
 final int HRA=1000;
	     FullTimeEmployee(String name, double monthlySalary) {
	        super(name, "FullTime");
	        this.monthlySalary = monthlySalary;
	    }

	    @Override
	     double calculateMonthlySalary() {
	        return (monthlySalary+HRA);
	    }
	}
 class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;
final int NOD=25;
    PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name, "PartTime");
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateMonthlySalary() {
        return hourlyWage * hoursWorked*NOD;
    }
}
 class Intern extends Employee {
	    private double stipend;

	    Intern(String name, double stipend) {
	        super(name, "Intern");
	        this.stipend = stipend;
	    }
	     double calculateMonthlySalary() {
	        return stipend;
	    }
	}
public class Tut9Demo {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean continueMenu = true;

	        do {
	            // Ask for employee name
	            System.out.print("Enter employee's name: ");
	            String name = scanner.nextLine();

	            // Ask for job type
	            System.out.print("Enter employee's job type (full-time, part-time, intern): ");
	            String jobType = scanner.nextLine().toLowerCase();

	            Employee employee = null;

	            switch (jobType) {
	                case "full-time":
	                    System.out.print("Enter the monthly salary: ");
	                    double salary = scanner.nextDouble();
	                    employee = new FullTimeEmployee(name, salary);
	                    break;

	                case "part-time":
	                    System.out.print("Enter hourly wage: ");
	                    double hourlyWage = scanner.nextDouble();
	                    System.out.print("Enter number of hours worked/day: ");
	                    int hoursWorked = scanner.nextInt();
	                    employee = new PartTimeEmployee(name, hourlyWage, hoursWorked);
	                    break;

	                case "intern":
	                    System.out.print("Enter the stipend amount: ");
	                    double stipend = scanner.nextDouble();
	                    employee = new Intern(name, stipend);
	                    break;

	                default:
	                    System.out.println("Invalid job type entered.");
	                    scanner.nextLine(); // Clear the buffer
	                    continue; // Skip to the next iteration
	            }

	            // Consume newline left-over
	            scanner.nextLine();

	            // Output the employee's details
	           	            if (employee != null) {
	                if (employee instanceof Intern) {
	                	
	                    System.out.println(employee.getName() + "'s Stipend: Rs" + employee.calculateMonthlySalary());
	                } else {
	                    System.out.println(employee.getName() + "'s Salary: Rs" + employee.calculateMonthlySalary());
	                }
	            }

	            // Ask user if they want to continue
	            System.out.println("Do you want to continue? (yes/no):");
	            String response = scanner.nextLine();
	            continueMenu = response.equalsIgnoreCase("yes");

	        } while (continueMenu);

	        // Close the scanner
	        scanner.close();
	    }
	}


