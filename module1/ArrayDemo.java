package module1;
import java.util.Arrays;
public class ArrayDemo {
	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		//int intArr1[] = new int[]; 
		//intArr1[3]=110; 
	//[8]=220; 
	//	System.out.println(intArr1[3]);
		Arrays.sort(intArr);
		String sArr[]= {"xyz","abc","pqr"};
		Arrays.sort(sArr);
		System.out.println("The sorted Array is:");
		for(int element:intArr) {
			System.out.println(element+" ");}
	for(String element:sArr) {
				System.out.println(element+" ");
			}
	}
}
