package Rem24;
import java.util.Scanner;
public class RemChar {

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter the first string");
			   String word =sc.nextLine();
			   System.out.println("enter the character to remove");
			  char charToRemove = word.charAt(0);
	        // Remove all occurrences of the character 'a'
	        String result = word.replace(String.valueOf(charToRemove), "");
	        System.out.println("Original String: " + word);
	        System.out.println("String after removing character '" + charToRemove + "': " + result);
	    }
	    
	}

