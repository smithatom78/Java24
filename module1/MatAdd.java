package m1;
	import java.util.Scanner;
public class MatAdd {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of rows in the A matrix:");
				int noOfRowsA = sc.nextInt();
				System.out.println("Enter the number of columns in the A matrix:");
				int noOfcolumnsA = sc.nextInt();
				int [][]matrixA = new int[noOfRowsA][noOfcolumnsA];
				System.out.println("Enter the elements of MatrixA");
				for(int i=0;i<noOfRowsA;i++) {
					for(int j=0;j<noOfcolumnsA;j++) {
						matrixA[i][j] = sc.nextInt();
					}//end for j
				}//end for i
				
				System.out.println("Enter the number of rows in the B matrix:");
				int noOfRowsB = sc.nextInt();
				System.out.println("Enter the number of columns in the B matrix:");
				int noOfcolumnsB = sc.nextInt();
				int [][]matrixB = new int[noOfRowsB][noOfcolumnsB];
				System.out.println("Enter the elements of MatrixB");
				for(int i=0;i<noOfRowsB;i++) {
					for(int j=0;j<noOfcolumnsB;j++) {
						matrixB[i][j] = sc.nextInt();
					}//end for j
				}//end for i
				
				
				int [][] matrixC = new int[noOfRowsA][noOfcolumnsA];
				for(int i=0;i<noOfRowsA;i++) {
					for(int j=0;j<noOfcolumnsA;j++) {
						matrixC[i][j] = matrixA[i][j]+matrixB[i][j];
					}
				}
				System.out.println(" matrix A ");
				for(int i=0;i<noOfRowsA;i++) {
					for(int j=0;j<noOfcolumnsA;j++) {
						System.out.print(matrixA[i][j]+"\t");
					}//end for j
					System.out.println();
				}// end for i
				System.out.println("matrix B ");
				for(int i=0;i<noOfRowsB;i++) {
					for(int j=0;j<noOfcolumnsB;j++) {
						System.out.print(matrixB[i][j]+"\t");
					}//end for j
					System.out.println();
				}// end for i
				System.out.println(" matrix C:");
				for(int i=0;i<noOfRowsA;i++) {
					for(int j=0;j<noOfcolumnsA;j++) {
						System.out.print(matrixC[i][j]+"\t");
					}
					System.out.println();
				}
				
			}

		}

	