package module3;
import java.io.*;
import java.util.Scanner;
public class FileTestDataRW
{
	public static void main(String[] args) throws IOException
	{
	  File fin = new File("content1.txt"); 
	  if(fin.exists())
	  {
	  System.out.println("exists ");
	  }else
	  {
		fin.createNewFile();
		System.out.println("created");
	  }
		FileWriter fout = new FileWriter("content1.txt",true);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("enter data");
				String buffer=br.readLine();
				fout.write(buffer+" ");	
			
			System.out.println("content added");
			fout.close();
			FileReader fr = new FileReader("content1.txt");
			BufferedReader br1=new BufferedReader(fr);
			String s;
			while((s=br1.readLine()) != null)
			{
			System.out.println(s);
			}
			fr.close();
	}}
