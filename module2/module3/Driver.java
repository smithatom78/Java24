package module3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
class numMaker
{  
    public int[][] createTestData()
		{Scanner sc= new Scanner(System.in);
		  
			int row,col;
			
			System.out.println("Enter the number of rows in the matrix");
			row=sc.nextInt();
			System.out.println("Enter the number of columns in the matrix");
			col=sc.nextInt();
			int array[][]= new int [row][col];
			System.out.println("Enter the elements in the matrix");
			for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			array[i][j]=sc.nextInt();
			return array;
		}
public void writeData(int[][]testData,String fileName)
{
	try
	{
	File txtFile = new File(fileName);
	FileWriter fw = new FileWriter(fileName);
	for(int i=0;i<testData.length;i++)
		{
		for(int j=0;j<testData[0].length;j++)
			fw.write(Integer.toString(testData[i][j])+" ");
			fw.write("\n");
		}
	fw.close();
	}
	catch(IOException e)
	{
	System.out.println("An error occured");
	}
}
public void readData(String fileName)
{
		try
		{
		    File txtFile= new File(fileName);
		Scanner sc= new Scanner(txtFile);
		while(sc.hasNextLine())
			{
			System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e)
		{
		
		System.out.println("File Not Found Exception");
		}
		}
}
class Driver {
    public static void main(String [] args) throws IOException {
        String file_write = new String();
        String file_read = new String();
        Scanner sc = new Scanner(System.in);
      //  numMaker nm = new numMaker(sc);
        numMaker nm = new numMaker();
      //  int row = nm.row;
        //int column = nm.column;
        int [][] matrix = new int[5][5];
        matrix = nm.createTestData();
        System.out.println("Enter the file name:");
        file_write = sc.next();
        nm.writeData(matrix, file_write);
        System.out.println("Enter the file name to read:");
        file_read = sc.next();
        nm.readData(file_read);
        sc.close();
    }
}




