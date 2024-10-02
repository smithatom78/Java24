package m1;
public class NumbersDivisibilityCheck {
	public static void main(String[] args) {
	/*Write a Java program to print numbers between 1 to 100 
	 * which are divisible by 3, 5 and by both.
	 */int count=0;
		  for (int num = 0; num < 100; num++)
	        {    
	         if (num % 3 == 0 && num % 5 == 0)
	            {	
	                System.out.print(num + " ");
	            count++;
	            }
	        }
		  System.out.print("\nThere are " +count +" numbers which are divisible by 3 & 5  ");
	}
}
