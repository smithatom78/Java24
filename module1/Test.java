package m1;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		// Write a Java program that accepts two integer 
		//values between 15 to 85 and return true 
		//if there is a common digit in both numbers.
		int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = s.nextInt();
        System.out.print("Enter second number:");
        num2 = s.nextInt();
        if ((num1<15 || num1>85)||(num2<15 || num2>85))
        {
        	System.out.print("Invalid input");	
        }
        else
        {
        	int last1=num1%10;
        	int last2=num2%10;
        	int first1=num1/10;
        	int first2=num2/10;
        	if((first1==first2)||(first1==last2)||(last1==first2)||(last1==last2))
        	{
        		System.out.print("True.Common digits exists");
        	}
        	else
        	{
        		System.out.print("No common digits");	
        	}
            
        }
        
	}

}
