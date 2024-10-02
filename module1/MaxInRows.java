package module1;


	import java.util.Scanner;

	public class MaxInRows {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number of rows in the matrix:");
	        int rows = sc.nextInt();

	        System.out.println("Enter the number of columns in the matrix:");
	        int columns = sc.nextInt();

	        int[][] matrix = new int[rows][columns];

	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("The matrix is:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        int[] maxInRows = new int[rows];

	        for (int i = 0; i < rows; i++) {
	            int max = matrix[i][0];
	            for (int j = 1; j < columns; j++) {
	                if (matrix[i][j] > max) {
	                    max = matrix[i][j];
	                }
	            }
	            maxInRows[i] = max;
	        }

	        System.out.println("Maximum elements in each row:");
	        for (int i = 0; i < rows; i++) {
	            System.out.println("Row " + (i + 1) + ": " + maxInRows[i]);
	        }

	        sc.close();
	    }
	}
