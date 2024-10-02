package m1;
//import java.util.Scanner;
	public class LargestOfThree {
	    public static void main(String[] args) {
	    	int num1=13,num2=45,num3=9;
	        if (num1 >= num2 && num1 >= num3) {
	            System.out.println(num1 + " is the largest number.");
	        } else if (num2 >= num1 && num2 >= num3) {
	            System.out.println(num2 + " is the largest number.");
	        } else {
	            System.out.println(num3 + " is the largest number.");
	        }
	    }
	}

