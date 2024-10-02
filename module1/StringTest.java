package module1;
public class StringTest {
	public static void main(String[] args) 
	{
		String str = "GodblessYou"; 
		System.out.println(str);  
		char arrch[]={'G','o','d','b','l','e','s','s','Y','o','u'}; 
		//converting char array arrch[] to string str2
		String str2 = new String(arrch,3,5);
		System.out.println(str2); 
	}
}
