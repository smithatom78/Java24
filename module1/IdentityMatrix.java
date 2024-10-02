package module1;
import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the identity matrix (n for an n x n matrix):");
        int size = sc.nextInt();

        int[][] identityMatrix = new int[size][size];

        // Fill the matrix to make it an identity matrix
        for (int i = 0; i < size; i++) {
            identityMatrix[i][i] = 1;
        }

        System.out.println("The identity matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(identityMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
