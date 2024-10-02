package lab24;
	import java.util.Scanner;
	public class Palindrome1 {	
			public static void main(String[] args) {
				boolean flag=true;
			        Scanner s = new Scanner(System.in);
			        System.out.print("Enter string: ");
			        String str = s.nextLine();
			        s.close(); 
			        int l = str.length();
			        System.out.println("length"+l);
			        for (int i = 0; i <l/2; i++) 
			        {
			        	if(str.charAt(i)!=str.charAt(l-i-1))
			        		flag=false;
			        		 break;
			        }
			        if(flag==true)
			        { System.out.println(str+ " is Palindrome");
			        }
			        else
			        	System.out.println(str+ " is not Palindrome");
			    }
			  }


