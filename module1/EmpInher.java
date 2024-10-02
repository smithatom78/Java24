package module1;
import java.util.Scanner; 
class employee
{
	String name,address; int age,mob;
	float sal;
	void print_Salary() 
	{
	  System.out.print(sal);
	}
}

class officer extends employee
{ 
	String spl;
	 void print_Specialization()
	 {
		 System.out.print(spl); 
	 }
}

class manager extends employee
{
	String dep;
	void print_Dept() {
		 System.out.print(dep); 
	}
}

public class EmpInher {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	officer off=new officer();
manager man=new manager();
System.out.print("Enter the officer's name\n"); 
off.name=sc.next();
System.out.println("Enter Address:\n"); 
off.address=sc.next(); 
System.out.print("Enter Specialization: \n");
off.spl=sc.next();
System.out.println("Enter Age:\n");
off.age=sc.nextInt(); 
System.out.print("Enter Phone Number:\n"); 
off.mob=sc.nextInt();
System.out.println("Enter Salary:\n"); 
off.sal=sc.nextFloat();
System.out.print("Enter the manager's Detail");
System.out.print("Enter the manager's name:\n");
man.name=sc.next();
 
System.out.println("Enter Address:\n");
man.address=sc.next(); 
System.out.print("Enter Department\n");
man.dep=sc.next();
System.out.println("Enter Age:\n"); 
man.age=sc.nextInt(); 
System.out.print("Enter PhoneNumber:\n");
man.mob=sc.nextInt();
System.out.println("Enter Salary:\n");
man.sal=sc.nextFloat();
System.out.println("\nOFFICER DETAILS:"); 
System.out.println("Officer's name:"+off.name);
System.out.println("Age:"+off.age); 
System.out.println("Address:"+off.address); 
System.out.println("PhoneNumber:"+off.mob); 
System.out.println("\nSpecialization:");
off.print_Specialization();
System.out.print("Salary:=");
off.print_Salary();
System.out.println();
System.out.println("\nMANAGERS DETAILS:");
System.out.println("Manager's name:"+man.name);
System.out.println("Age:"+man.age); 
System.out.println("Address:"+man.address);
System.out.println("Phone Number:"+man.mob);
 
System.out.println("Department:"); 
man.print_Dept();
System.out.print("Salary:="); 
man.print_Salary();
}

}
