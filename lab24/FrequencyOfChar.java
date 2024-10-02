package lab24;
import java.util.*;

public class FrequencyOfChar {
		public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				String s1;
				int count=0;
				System.out.println("Enter the string:");
				s1=sc.nextLine();
				char ch;
				System.out.println("Enter the character:");
				ch=sc.next().charAt(0);	
				for(int i=0;i<s1.length();i++)
				{
					if(ch==s1.charAt(i))
						count++;
				}
				System.out.println("No.of occurence of characher "+ch+ " in the string "+s1+" is "+count);	
			}

		}