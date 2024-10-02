package lab24;
import java.util.Scanner;
public class Palindrome {	
		public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter string: ");
		        String str = s.nextLine();
		        s.close(); 
		        // close the scanner after use
		        String rev = "";
		        int l = str.length();
		        for (int i = l - 1; i >= 0; i--) {
		            rev = rev + str.charAt(i);
		        }
		        System.out.println("Reverse: " + rev);
		        if(str.equals(rev))
		        { System.out.println(str+ " is Palindrome");
		        }
		        else
		        	System.out.println(str+ " is not Palindrome");
		    }
		  }

