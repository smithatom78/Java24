package module5;
import java.io.*;
import java.util.*;
public class FileLineNoDemo {
	public static void main(String[] args) throws IOException
	{
		//FileReader fr = new FileReader ("test.txt");
		//LineNumberReader linereader = new LineNumberReader(fr);
		LineNumberReader linereader = new LineNumberReader(new FileReader ("test.txt"));
		int i;		        
		while((i=linereader.read())!=-1)
		{	System.out.println((linereader.getLineNumber()+1)+": "+(char)i+linereader.readLine());	
		}
		
		linereader.close();
		//fr.close();
	}
}

	

