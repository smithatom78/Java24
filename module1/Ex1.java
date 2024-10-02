package m1;
import java.util.Scanner;
public class Ex1 {
	public static void main(String args[])
	{
	Scanner c = new Scanner(System.in);
	System.out.print("What is your name? ");
	String name = c.next();
	System.out.println(name);
	
	if(name.equalsIgnoreCase("admin"))
	{    
	    System.out.println("Welcome to Administrator Control Panel");
	}else
		 System.out.println("Sorry.You are not  the Administrator");
String s1="Hello";
String s2=" Java";
System.out.print(s1.concat(s2));}}


