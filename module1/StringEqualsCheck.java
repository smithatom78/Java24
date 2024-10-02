package m1;

public class StringEqualsCheck {
	public static void main(String[] args) {
		String s3 = "Java"; 
		String s4 = "Java"; 
		System.out.println(s3.length());
		System.out.println(s3 == s4);//true
		String s1 = new String("Java"); 
		String s2 = new String("Java"); 
		//s1=s2;
		System.out.println(s1 == s2); //false
		//	When the operator == is used to compare object variables,it returns true ,
		//when the two variables refer to the same Object
		//.equals() is a method that compares the actual content of the object.
		System.out.println(s1.equals(s2));//true
	}
}
