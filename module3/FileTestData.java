package module3;
import java.io.*;
import java.util.Scanner;
public class FileTestData
{
	public static void main(String[] args) throws IOException
	{
	  File fin = new File("content.txt"); 
	  if(fin.exists())
	  {
	  System.out.println("exists ");
	  }else
	  {
		fin.createNewFile();
		System.out.println("created");
	  }
	  try {
		  FileOutputStream  fout = new FileOutputStream("content.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		   System.out.println("enter data");
		   String s=br.readLine();
		   //converting string to byte array
		   byte[] arr = s.getBytes();
		   fout.write(arr);
		   System.out.println("data added");
		   
			}
			catch (Exception e) 
			{
			System.out.println("File Not Found");
			}
	  int i=0;
		// create new file input stream
		FileInputStream fin1 = new FileInputStream("content.txt");
			while((i=fin1.read())!=-1) 
		{
			//Converts Byte to Character
			char c = (char)i;
			System.out.print(c);
			}
		}

	}
