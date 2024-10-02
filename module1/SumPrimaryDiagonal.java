package m1;
import java.util.Scanner;
public class SumPrimaryDiagonal {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Input matrix dimensions
	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = scanner.nextInt();
	        // Declare matrix
	        int[][] matrix = new int[rows][cols];
	        // Input matrix elements
	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	        System.out.println("elements of the matrix are:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	            	System.out.print(matrix[i][j]+" ");
	            }System.out.print("\n");
	        }
	        int primaryDiagonalSum = 0;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                // Primary diagonal (i == j)
	                if (i == j) {
	                    primaryDiagonalSum += matrix[i][j];
	                }
	            }
	        }
	        // Output the sums
	        System.out.println("Sum of primary diagonal: " + primaryDiagonalSum);
	        scanner.close();
	    }
	}
