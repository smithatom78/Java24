package module2;

import java.util.Scanner;

public class Holiday {
 String name;
 int day;
String month;
// your code goes here
Holiday(String name,int day,String month)
{
	this.name=name;
	this.day=day;
	this.month=month;
}
void display()
{
System.out.println(name+" is on "+day+"th day of the month "+month);	

}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String monthName;
	String event;
	int dayofevent;
	System.out.println("Enter the event:");
	event = sc.nextLine();
	
	System.out.println("Enter the Month Name:");
	monthName = sc.next();
	System.out.println("Enter the Date:");
	dayofevent = sc.nextInt();
	Holiday ob1=new Holiday(event,dayofevent,monthName);
ob1.display();
	
}	
}
