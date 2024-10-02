package m1;
import java.util.Scanner;

class EmployeeInfo
{
	String name,address;
	int year,salary;
	void display()
	{
		System.out.println("name is: "+name);
		System.out.println("address is:"+address);
		System.out.println("year of joining:"+year);
		System.out.println("salary is:"+salary);
	}
}

public class InfoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeInfo emp1=new EmployeeInfo();
		System.out.println("enter the name :");
		emp1.name=sc.nextLine();
		System.out.println("enter your address:");
		emp1.address=sc.nextLine();
		System.out.println("enter the year of joining :");
		emp1.year=sc.nextInt();
		System.out.println("enter your salary:");
		emp1.salary=sc.nextInt();
		sc.nextLine();
		EmployeeInfo emp2=new EmployeeInfo();
		System.out.println("enter the name :");
		emp2.name=sc.nextLine();
		System.out.println("enter your address:");
		emp2.address=sc.nextLine();
		System.out.println("enter the year of joining :");
		emp2.year=sc.nextInt();
		System.out.println("enter your salary:");
		emp2.salary=sc.nextInt();
		emp1.display();
		emp2.display();

	}

}