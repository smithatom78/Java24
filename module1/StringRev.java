package module1;
	import java.util.Scanner;
	public class StringRev {
	 public static void main(String[] args) {
	   System.out.println("Reversed string for: ");
	   Scanner scn = new Scanner(System.in); // scanner object
	   String str = scn.nextLine(); // taking the input with scanner
	   String reversedStr = "";
		   for (int s = str.length()-1; s >= 0; s--) 
		   {
			   	reversedStr = reversedStr + str.charAt(s);
		   }
	   System.out.println("Original string: " + str);
	   System.out.println("Reversed string: " + reversedStr);
	   scn.close();
	 }
	}
