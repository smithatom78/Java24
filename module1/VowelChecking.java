package m1;
import java.util.Scanner;
public class VowelChecking {
	public static void main(String[] args) 
	{		Scanner s=new Scanner(System.in);
			System.out.println("Enter a character : ");
			char ch=s.next().charAt(0); 
			switch(ch)
			{  case 'a' :
			   case 'e' :
		   	   case 'i' :
			   case 'o' :
			   case 'u' :
			   case 'A' :
			   case 'E' :
			   case 'I' :
			   case 'O' :
			   case 'U' :
			   System.out.println(ch+" is  a Vowel");
			   break;
			   default:
				   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
						System.out.println(ch+" is a Consonant");
					   else
						System.out.println("Input is not an alphabet");		
				        }   
			}
	}

