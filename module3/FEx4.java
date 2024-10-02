package module3;
//Import the File class
import java.io.*;
public class FEx4
{ public static void main(String[] args) throws IOException 
    { 
	try { int i=0;
   FileOutputStream  fout = new FileOutputStream("sample.txt",true);
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
   System.out.println("enter data");
   String s=br.readLine();
   byte[] arr = s.getBytes();
   fout.write(arr);
      System.out.println("data added");
      FileInputStream fin = new FileInputStream("file1.txt");
      System.out.println(fin.available()); 

      while((i=fin.read())!=-1) 
      {
    char c = (char)i;
      	System.out.print(c);
      	}
	}
	catch (Exception e) 
	{
	System.out.println("File Not Found");
	} }
}