package module3;
import java.util.Scanner;

public class CustException 
{
	 public static void main(String args[]) throws AgeException
	 {  
	         Scanner sc = new Scanner(System.in);
	         System.out.print("Enter age:");
				int age = sc.nextInt();
				try
				{
				if(age<12 || age>60) 
				{
					throw new AgeException("not eligible");
				}
				}	
				
		catch(AgeException e)
			{
			System.out.println("invalid.enter valid age ");
				System.out.println(e.getMessage());
			}
					System.out.println("thank you for registering");
	  

}
}