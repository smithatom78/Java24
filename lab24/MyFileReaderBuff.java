package lab24;
import java.io.*;
public class MyFileReaderBuff {
	public static void main(String args[]) throws IOException
	{
	FileReader fr = new FileReader("sample.txt");
	BufferedReader br=new BufferedReader(fr);
	String s;
	while((s=br.readLine()) != null)
	{
	System.out.println(s);
	}
	fr.close();
	}
	}
