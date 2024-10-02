package module3;
import java.util.Scanner;
class CalcAverage 
	{
			   public double avgFirstN(int N) 
			   {
			    int sum = 0;
			    if (N <= 0)
			      throw new IllegalArgumentException("ERROR: Illegal argument");
			    for (int k = 1; k <= N; k++)
			      sum += k;
			    return sum/N;         // What if N is 0?
			   } // avgFirstN()
	 } // CalcAverage
public class TestException
{ public static void main(String args[])
	 {		  Scanner sc = new Scanner(System.in);
			  System.out.print("Enter Number:");
		    	int num = sc.nextInt();
				try 
				{CalcAverage ca = new CalcAverage();
			      System.out.println( "AVG = " + ca.avgFirstN(num));
			    }catch (IllegalArgumentException e)
				{ // Exception Handler
			      System.out.println(e.getMessage());
			      //e.printStackTrace();
			    }System.out.println("Out of try catch");
	}//main	// CalcAv
}



