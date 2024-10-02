package module3;
import java.io.*;
import java.util.Scanner;
public class FileTestRW
{
	public static void main(String[] args) throws IOException
	{
	  File fin = new File("num8.txt"); 
	  if(fin.exists())
	  {
	  System.out.println("exists ");
	  }else
	  {
		fin.createNewFile();
		System.out.println("created");
	  }
		FileWriter fout = new FileWriter("num8.txt");
			Scanner sc=new Scanner(System.in);
			System.out.print("no of elements:");
			int n=sc.nextInt();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("enter elements");

			for(int i=1;i<=n;i++)
			{
				System.out.print("Enter the number "+i+":");
				String num=br.readLine();
				fout.write(num+" ");	
				
			}
			System.out.println("numbers added");
			fout.close();
			FileReader fr = new FileReader("num8.txt");
			BufferedReader br1=new BufferedReader(fr);
			String s;
			while((s=br1.readLine()) != null)
			{
			System.out.println(s);
			}
			fr.close();
	}}
