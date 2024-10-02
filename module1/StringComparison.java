package module1;
import java.util.Scanner;
public class StringComparison {
public static void main(String args[])
{Scanner c = new Scanner(System.in);
System.out.print("What is your name? ");
String name = c.nextLine();
System.out.println(name);
//if (name == "admin") 
//Relational operators such as < and == fail on objects.
//if(name.equals("admin"))
if(name.equalsIgnoreCase("admin"))
{    System.out.println("God loves you");
    System.out.println("Welcome to heaven");
}}}