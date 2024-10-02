package module1;
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		// Add two numbers a& b
		Scanner sc = new Scanner(System.in);
		int firstNumber,secondNumber;
		System.out.println("Enter the Numbers:");
		firstNumber= sc.nextInt();
		secondNumber= sc.nextInt();
	//	System.out.println("sum of firstNumber& secondNumber:"+(firstNumber+secondNumber));
		System.out.println( firstNumber+" + "+ secondNumber+" = "+(firstNumber+secondNumber));
		String firstName,lastName;
		System.out.println("Enter the Names:");
		firstName= sc.next();
		lastName= sc.next();
	//	System.out.println("sum of firstNumber& secondNumber:"+(firstNumber+secondNumber));
		System.out.println( "My full name is "+(firstName+lastName));
	}

}
