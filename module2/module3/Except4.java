package module3;
import java.util.Scanner;
class checkEligibility
{
	void check(int age,int empno)
	{ 
		if(age<18) {
			 throw new ArithmeticException("Below 18.not eligible for registration");
			}else
			{
			System.out.println("registration valid");
			}
	}
}
public class Except4 {
	 public static void main(String args[]) 
	 {	     Scanner sc = new Scanner(System.in);
	         System.out.print("Enter age:");
			int age = sc.nextInt();
			System.out.print("Enter Empno:");
			int wt = sc.nextInt();
			checkEligibility c=new 	checkEligibility();
			//	c.check(age,wt);
			try {
				c.check(age,wt);
				}
			catch(ArithmeticException e)
			{
			System.out.println(e.getMessage());
			System.out.println("thank you .Try Next Time");
			}
			System.out.println("Rest of the code");
	   		}
	 }

