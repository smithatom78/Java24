package module1;

import java.util.Scanner;

class LinearSearchExample
 {    
 int linearSearch(int[] arr, int key)
 {    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
 }}
public class LinearSearchDemo {

	public static void main(String[] args) {
		LinearSearchExample obj=new LinearSearchExample();
	int n;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		n=sc.nextInt();  
		//creates an array in the memory of length 10  
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array Length: "+array.length); 
		System.out.println("Array elements are: ");  
		// accessing array elements using the for loop  
		for (int i=0; i<n; i++)   
		{  
		System.out.print(array[i]+"\t");  
		} 
		System.out.println("Enter the element to be searched: ");  
		//reading the number of elements from the that we want to enter  
		int numtosearch=sc.nextInt();    
        System.out.println(numtosearch+" is found at index: "+obj.linearSearch(array, numtosearch));    
  
	}

}
    
   