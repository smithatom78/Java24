package m1;
public class SearchString {
	public static void main(String[] args) {
		String s1="Example of indexOf in java String";
		//passing substring
		int index1=s1.indexOf("java");//returns the indexOf of substring
		int index2=s1.indexOf("index");//returns the index of index substring
		System.out.println("length of string:" +s1.length());
		System.out.println("index of ample:" +s1.indexOf("ample"));
			System.out.println("index of java:" +index1);
		System.out.println("index of index:" +index2);
	}
}
