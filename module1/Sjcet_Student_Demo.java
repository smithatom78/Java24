package m1;

import java.util.Scanner;

class Student {
String fullname,email,regno,stdtype;
int phone;
void display_Student() 
{ System.out.print(fullname+"\t "+email+"\t "+regno+"\t"+stdtype);
}
}
class Hostler extends Student 
{ String hostelname;
void print_hostel() 
{ System.out.print(hostelname);
}
}
class Dayscholar extends Student { 
	String route;
void print_Bus() 
{ System.out.print(route);
}
}

public class Sjcet_Student_Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		Student std=new Student();
	Hostler hos=new Hostler(); 
	Dayscholar day=new Dayscholar(); 
	System.out.print("Enter the  name\n"); 
	std.fullname=sc.next();
	System.out.println("Enter Regno:\n");
	std.regno=sc.next();
	System.out.print("Enter Email: \n");
	std.email=sc.next();
	System.out.println("Enter Phone:\n"); 
	std.phone=sc.nextInt(); 
	System.out.print("Enter Student Type:\n"); 
	std.stdtype=sc.next(); 
	String mydata;
	if(	(std.stdtype).equals("Hostler"))
	{
		mydata="Hostle Name";
	System.out.println("Enter Hostelname:\n"); 
	hos.hostelname=sc.next();
	}else
	{
		mydata="Bus Route";
	System.out.println("Enter Route:\n"); 
	day.route=sc.next();
	}
	System.out.println("\nStudent DETAILS:");
	System.out.println("full name\t email\t regno \tstdtype\t"+mydata );
	std.display_Student();
	if(	(std.stdtype).equals("Hostler"))
	{
		hos.print_hostel();
	}
	else
	{
		day.print_Bus();
	}
	}

}
