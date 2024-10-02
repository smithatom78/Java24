package Rem24;
import java.util.*;
public class SmallLarge {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		 int[] arr=new int[10];
		  
		 System.out.println("Enter the number of elements in the array:");
		  int n=Sc.nextInt();
		  
		 System.out.println("Enter the elements in the array:");
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=Sc.nextInt();
		  }
		  int max=arr[0];
		   int min=arr[0];
		   for(int i=1;i<n;i++)
		   {
						   if(arr[i]>max)
			   {
				 max=arr[i];
			   }
						   if (arr[i] < min) {
				                min = arr[i];
				            }  
							 }   
			  
		   System.out.println("Largest element in the array is "+max );
		   System.out.println("Smallest element in the array is "+min);

	}

}
