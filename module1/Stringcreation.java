package module1;
public class Stringcreation{  
	   public static void main(String args[])
	{  
	//creating a string by java string literal 
	String str = "Beginnersbook"; 
	System.out.println(str);  
	char arrch[]={'h','e','l','l','o'}; 
	//converting char array arrch[] to string str2
	String str2 = new String(arrch);
	 System.out.println(str2);  
	//creating another java string str3 by using new keyword 
	String str3 = new String("Java String Example"); 
	//Displaying all the three strings
	System.out.println(str3);  
	   }
	}