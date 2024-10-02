package m1;
import java.util.*;
public class Testpgm{
		public static void main(String[] args)
		{
			Scanner s= new Scanner(System.in);
		System.out.println("Enter the no of rows:");
			int noOfRows=s.nextInt();
			System.out.println("Enter the no of columns:");
			int noOfcolumns=s.nextInt();
			int[][] matrix= new int[noOfRows][noOfcolumns];
			System.out.println("Enter the elements:");
			for (int i=0;i<noOfRows;i++)
			{
				for (int j=0;j<noOfcolumns;j++)
				{
					matrix[i][j]= s.nextInt();
				}
			}
			s.close();
		}
	}
