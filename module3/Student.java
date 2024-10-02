package module3;
import java.util.Scanner;
class Student1
{	int rollno;
	String name;
	String email;
	int phone;
  String college;
 
 Student1(int rollno,String name,int phone,String email,String college)
	{
	 this.rollno=rollno;
	this.name=name;
	this.email=email;
	this.phone=phone;
	this.college=college;
	}
void display()
	{
	System.out.println(rollno+"\t"+name+"\t "+email+"\t"+phone+"\t "+college)	;
	}
}
public class Student
{

public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the No of students :");
		   int nu=sc.nextInt();
		  Student1 S[] = new Student1[nu];  
	        for (int i = 0; i < S.length; i++) 
	        {  
	     System.out.println("Enter the Roll no :");
		   int rollno=sc.nextInt();
		  System.out.println("Enter the Name :");
		   String name=sc.next();
		   System.out.println("Enter the phone no :");
		   int phone=sc.nextInt();
		    System.out.println("Enter the email :");
		   String email=sc.next();
		   System.out.println("Enter the college :");
		   String college=sc.next();
			S[i] =new Student1(rollno,name,phone,email,college);
			
		  }
	        for (int i = 0; i < S.length; i++) 
	        {
				S[i].display();}	  
		}


}
