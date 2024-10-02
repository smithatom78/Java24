package m1;
import java.util.Scanner;
public class StringExample {
	public static void main(String args[])
	{
	Scanner c = new Scanner(System.in);
	//System.out.print(str);
	System.out.print("Enter the message ");
	String msg = c.nextLine();
	System.out.println(msg);
	System.out.println(msg.length());
	System.out.println(msg.indexOf("e")); 
	System.out.println(msg.substring(4,7)) ; 
	//String s3 = msg.substring(7, 4);
	//System.out.println(s3); 
	System.out.println(msg.toUpperCase());  
 	}
}


