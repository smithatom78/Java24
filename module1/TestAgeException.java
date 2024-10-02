package m1;

import java.util.Scanner;

import module3.AgeException;

public class TestAgeException {

	public static void main(String[] args) throws AgeException{
		 Scanner sc = new Scanner(System.in);
         System.out.print("Enter age:");
			int age = sc.nextInt();
			if(age<12 || age>60) 
			{
				throw new AgeException();
			}
	}

}
