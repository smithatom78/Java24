package m1;
	import java.util.Scanner;
	public class FrequencyNumber {
	    public static void main(String[] args) {
	    	//Write a Java program to find the frequency (count the occurrence) of each
	    	//element in an integer array.
	        	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();
	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }
	        scanner.close();
	        boolean[] visited = new boolean[size];
	        System.out.println("Frequency of each element:");
	        // Calculate the frequency of each element
	        for (int i = 0; i < size; i++) {
	            if (visited[i]) {
	                continue; // Skip already counted elements
	            }
	            int count = 1; // Initialize count for the current element
	            // Count occurrences of the current element
	            for (int j = i + 1; j < size; j++) {
	                if (array[i] == array[j]) {
	                    count++;
	                    visited[j] = true; // Mark this element as counted
	                }
	            }
	            // Print the element and its frequency
	            System.out.println(array[i] + " - " + count + " times");
	        }
	    }
	}
