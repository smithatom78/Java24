package module3;
import java.util.Scanner;
import PrimePackage.Prime;
public class PrimeTest 
{	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int inputNumber = sc.nextInt();
		boolean isItPrime = Prime.isPrime(inputNumber);
			if (isItPrime)
			{
			System.out.println(inputNumber+" is a prime number.");
			}
			else
			{
			System.out.println(inputNumber+" is not a prime number.");
			}
			sc.close();
	}
}
