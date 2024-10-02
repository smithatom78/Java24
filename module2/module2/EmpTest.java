package module2;
import java.util.Scanner;
class Employee
{   int salary;

Employee(int salary)
{
this.salary=salary;	
}
	void display(){
	   System.out.println("name of class is Employee");
   }
  void calculateSalary(){
	
	  System.out.println("\tSalaray of Employee is"+salary);
   }
 }
class Engineer extends Employee
{  
	Engineer(int salary)
     {super(salary);
     	this.salary=salary;
       }
	void display(){
		   System.out.println("name of class is Engineer");
	   }
	void calculateSalary(){
		super.display();
	     super.calculateSalary();
	     display();
		  System.out.println("\tSalary of Engineer is"+(salary*2));
	   }
 }
public class EmpTest {
	public static void main(String[] args) {
	    Engineer e=new Engineer(10000);
		e.calculateSalary();
	}}
