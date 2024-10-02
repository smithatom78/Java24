package module3;
import java.io.*;
public class FileAdd {
	public static void main(String arg[]) throws IOException
	{
	try
	{File fin = new File("myfile.txt"); 
	  if(fin.exists())
	  {
	  System.out.println("exists ");
	  }else
		  
	  {
		fin.createNewFile();
		System.out.println("created");
	  }
	String s="Smitha Jacob is Your Java Teacher";
	FileWriter f = new FileWriter("myfile.txt");
    f.write(s+"\nAll the Best");
    String s1="\nI love Java World";
    f.write(s1);
    f.close();
    	System.out.println("Written to file input.txt");
	}
	catch(FileNotFoundException e)
	{
	System.out.println("File not found");
	}
	
	} 
}
