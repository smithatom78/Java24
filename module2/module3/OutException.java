package module3;
import java.util.Scanner;
public class OutException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		int n=sc.nextInt();  
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
		System.out.println("\nEnter the position of element to be accessed: ");  
		//reading the number of elements from the that we want to enter  
		int numtoacc=sc.nextInt(); 
		 try {
	         //   int a[] = new int[5];
			 System.out.print(array[numtoacc]); 
			 // accessing 7th element in an array of size 5
			  
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index is Out Of Bounds");
	        }
		/*try {
            String a = null; // null value
            System.out.println(a.charAt(0));
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }*/
		/*Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String a= sc.nextLine();
        try {
            int num = Integer.parseInt(a);
              System.out.println(a);
        }
        catch (NumberFormatException e) {
            System.out.println("Number format exception");
            System.out.println(e);
        }*/
	}

}
