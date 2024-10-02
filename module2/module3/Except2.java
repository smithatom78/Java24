package module3;
import java.util.Scanner;
public class Except2 {
	void divide(int num1,int num2)
		{	if (num2==0) 
		{
		throw new ArithmeticException("Division by zero is not allowed");
		}
		float div=num1/num2;
		System.out.print("res="+div);
		
	}
		 public static void main(String args[]) {
		 Except2 ob=new  Except2();
      	     Scanner sc = new Scanner(System.in);
	         System.out.print("Enter a:");
				int a1 = sc.nextInt();
				System.out.print("Enter b:");
				int b1 = sc.nextInt();
				try 
				{
				ob.divide(a1, b1);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				System.out.println("Rest of code");      
	      }
}
