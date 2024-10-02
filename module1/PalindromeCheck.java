package m1;
import java.util.*;
import java.util.Arrays;
public class PalindromeCheck {
		    public static void main(String[] args) {
		    	// Author Liya Tony
				  // Date : 23/9/2022
				String str,str1="";int len;char re;int i;
				 Scanner sc = new Scanner(System.in);
				// String str1=new String();
		do	 {
			  System.out.println("Enter the string");
			        str=sc.next();
			  //      String str1=new String();
			        len=str.length();
			        for(i=len-1;i>=0;i--)
			        {str1=str1+str.charAt(i);
			        }
			        if(str1.equalsIgnoreCase(str))
			        {	System.out.println("String is palindrome");
			        }else
			        	{System.out.println("String is not palindrome");
			        	}
			        System.out.println("Do you want to continue");
					re=sc.next().charAt(0);
					 }while(re=='y'||re=='Y');
				//  sc.close();
			        }}