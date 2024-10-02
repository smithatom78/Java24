package module1;
import java.util.*;
public class SearchArrayDemo {
	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		Scanner sc=new Scanner(System.in);
		//Binary Search requires Arrays to be sorted first  
        Arrays.sort(intArr); 
        System.out.println("Enter the number to search:");
		int intKey = sc.nextInt();
      //Element to search
     //  int intKey = 22; 
   int ind=Arrays.binarySearch(intArr, intKey);
   if (ind>=0)
   {
        System.out.println(intKey + " found at index in the sorted array = "
                           + ind); 
   }
   else
   { System.out.println(intKey + "is Not found in array");
	}
	}
}
