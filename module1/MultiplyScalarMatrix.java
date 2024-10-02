package module1;

	import java.util.Scanner;


public class MultiplyScalarMatrix {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number of rows in the 2D matrix:");
			int noOfRows = sc.nextInt();
			System.out.println("Enter the number of columns in the 2D matrix:");
			int noOfcolumns = sc.nextInt();
			int [][]matrix = new int[noOfRows][noOfcolumns];
			System.out.println("Enter the elements");
			for(int i=0;i<noOfRows;i++) {
				for(int j=0;j<noOfcolumns;j++) {
					matrix[i][j] = sc.nextInt();
				}//end for j
			}//end for i
	        System.out.println("Enter the scalar value to multiply with the matrix:");
	        int scalar = sc.nextInt();

	        int[][] result = new int[noOfRows][noOfcolumns];
	        for (int i = 0; i < noOfRows; i++) {
	            for (int j = 0; j < noOfcolumns; j++) {
	                result[i][j] = scalar * matrix[i][j];
	            }
	        }

	        System.out.println("The resulting matrix after scalar multiplication is:");
	        for (int i = 0; i < noOfRows; i++) {
	            for (int j = 0; j < noOfcolumns; j++) {
	                System.out.print(result[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}
