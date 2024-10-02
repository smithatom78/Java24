package Rem24;
import java.util.Scanner;
	public class ConcatSum {
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
String response;
			int choice=0;
			do
			{
			   System.out.println("Perform an operation");
			   System.out.println("1. Add two integers");
			   System.out.println("2. Concatinate two strings");
			   System.out.println("Choose an operation");
			   choice= sc.nextInt();
			 
			   switch (choice)
			  {
			   case 1://add two integers
				   System.out.println("enter the first integer:");
				   int a=sc.nextInt();
				   System.out.println("enter the second integer:");
				   int b=sc.nextInt();
				   int sum=a+b;
				   System.out.println("the sum of" + a +"and" + b +"is"+ sum);
				   break;
				   
			   case 2://concatinate two strings
				   System.out.println("enter the first string");
				   String first =sc.next();
				   System.out.println("enter the second string");
				   String second =sc.next();
				   System.out.println("the concatinated string is"+first+second);
				   break;
						   
			   default :
				   System.out.println("invalid option!!!");
				   
			  }
			
            System.out.println("Do you want to continue? (y/n)");
            response= sc.next();

        } while (response.equalsIgnoreCase("y"));
			
			
			 System.out.println("Prigram Terminated");	
			
	        }
			
	}

