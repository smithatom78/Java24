package module4;
import java.io.*;
import java.util.*;
public class FileHandlingDemo {
	public static void main(String[] args) {
		//Author:Prof.Smitha Jacob,on Nov 11 2022
			try {
				File ob=new File("sample.txt");
				if(ob.exists())
				{
				System.out.println("The file "+ob.getName()+" exists");
				}
				else 
				{
				ob.createNewFile();
				System.out.println("Created the file:"+ob.getName());
			    }
				Scanner sc=new Scanner(System.in);
			    System.out.println("enter the details to be inserted into the file");
			    String str=sc.nextLine();
			    FileWriter fw=new FileWriter(ob);
			    fw.write(str);
			    System.out.println("Content entered into sample.txt");
			    fw.close();
			    File ob1=new File("new-sample.txt");
				if(ob1.exists())
				{
				System.out.println("The file "+ob1.getName()+" exists");
				}
				else 
				{
				ob1.createNewFile();
				System.out.println("Created the file:"+ob1.getName());
			    }
				FileReader fr=new FileReader("sample.txt");
				char[] content=new char[50];
				fr.read(content);
				fr.close();
				System.out.println("Content of sample.txt is : ");
				System.out.println(content);

				FileWriter fw1=new FileWriter("new-sample.txt");
				fw1.write(content);
				fw1.close();
				System.out.println("\nCopied the content from sample.txt to new-sample.txt");
				FileReader fr1=new FileReader("new-sample.txt");
				BufferedReader br=new BufferedReader(fr1);
				String copy;
				System.out.println("\nContent of new-sample.txt is :");
				while((copy=br.readLine())!=null)
				{
				System.out.print(copy);
				}

				}
		catch(Exception e)
				{
				System.out.println("exception");
				}
				}

}
