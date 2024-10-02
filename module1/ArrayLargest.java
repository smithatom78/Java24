package module1;

import java.util.Scanner;
class Large
{
	
}
public class ArrayLargest {

	public static void main(String[] args) {
		int n,large; 
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		n=sc.nextInt();  
		//creates an array in the memory of length 10  
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		// accessing array elements using the for loop  
		for (int i=0; i<n; i++)   
		{  
		System.out.print(array[i]+"\t");  
		} 
		large=array[0];
		for (int n1 : array) {
		    if (n1>large) 
		        {
		    	large=n1;
		        }
		    }
		System.out.print("Largest element : "+large);  	
		   
	}

}
