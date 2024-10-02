package lab24;
import java.util.Scanner;

class Employee3 
{
	float salary;
	int DR;
	int HRA;

	Employee3(int salary,int DR,int HRA) 
	{
	this.salary= salary;
	this.DR=DR;
	this.HRA=HRA;
	}

     void display()
     {
    	 System.out.println("... employee...");
     }
  
     void calcSalary()
	{
	salary =salary+((salary*DR)/100)+((salary*HRA)/100);
	System.out.println("Gross Salary of the employee is "+salary );
	}
}
class  Engineer1 extends Employee3
{
	Engineer1(int salary ,int DR,int HRA)
	{
		super(salary,DR,HRA);
	}    
	void  display() 
	{
		super.display();
	}

void calcSalary()
	{
	super.calcSalary();
	salary= salary*2;
	System.out.println("Gross Salary of the engineer is "+salary);
	}
}
public class EmployeeTestDemo 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the basic salary of the employee");
	int salary =sc.nextInt();
	System.out.println("enter the DA%  of the employee ");
	int DR=sc.nextInt();
	System.out.println("enter the HR%  of the employee ");
	int HRA=sc.nextInt();
	Engineer1 e=new Engineer1(salary,DR,HRA);
	e.display();
	e.calcSalary();
	sc.close();
	
	}

}