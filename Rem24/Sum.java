package Rem24;
import java.util.Scanner;
public class Sum {
	public static void main(String[]args)
	{//intro of scanner 
    Scanner sc=new Scanner(System.in);
    String response;
    //outs to be included
    do
	{
    	 	  
    System.out.println("operation given ");
    System.out.println("1. Addition of integers");
    System.out.println("2.concatioantion of two strings");
    //body of the prgm
    // reading...
    System.out.println("Enter your choice");
    int ad = sc.nextInt();
    
    switch(ad)
    {
        case 1:
            System.out.println("Enter first integer:");
            int a= sc.nextInt();
            System.out.println("Enter second integer:");
            int b=sc.nextInt();
            System.out.println("addition of two integers"+a+"+"+b+"u will get a result of"+(a+b));
            break;
        case 2:
        //concatenation of 2 strings 
            System.out.println("enter a str A ");
            String c=sc.next();
            System.out.println("enter a str B ");
            String d=sc.next();            
            System.out.println("entered string after concationation is : "+(c+d));
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
