package module3;
import java.util.*;
public class CustomExceptionTest {
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
			int sum = 0,count=0;
			float avg1=0;
			int num[]=new int[5];
			System.out.println("Enter 5 Numbers");
			for(int i=0;i<5;i++)
			 { num[i]=s.nextInt();
			 }
			System.out.println("Numbers are");
			 for(int i=0;i<5;i++)
			 { 
			  try {
				if (num[i]<=0)
				 	{throw new MyException("invalid Number"+num[i]);}
				 else
				 	{count=count+1;
				 	System.out.println(num[i]+"\t");
					 sum=sum+num[i];
				 	}
				 }
				 catch(MyException e)
				 {
					 System.out.println(e.getMessage());
				 }
				finally
			     {
				 avg1=sum/count;
				 }
				}
			 		System.out.println("\nsum of the positive numbers are: " + sum);
				 System.out.println("Average of these numbers: " + avg1);
					
			 		
			  }  
	}
			

