package module1;
import java.util.Scanner; 
public class Frequency {
public static void main(String[] args)
{ String str;
char a;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the string:"); 
str=sc.nextLine();
System.out.println("Please enter the character to search");
a=sc.next().charAt(0);
 char aCopy=Character.toLowerCase(a); 
 int f=0;
String strCopy=str; 
str=strCopy.toLowerCase(); 
for (int i=0;i<str.length();i++)
{
if (a==str.charAt(i)) 
{

++f;

}

}

System.out.println("The frequency of a given character:"+a+" in the string "+strCopy+" is: "+f);

}

}
