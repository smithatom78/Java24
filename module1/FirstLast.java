package module1;
import java.util.Scanner;
public class FirstLast {
	public static void main(String args[])
	{
	
	Scanner c = new Scanner(System.in);
	System.out.print("Enter the message ");
	String msg = c.nextLine();
	String str = msg.substring(1, msg.length()-1);
	System.out.println(str);
}}