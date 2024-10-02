package module3;
import java.io.*;
public class FEx1
{ public static void main(String[] args) throws IOException 
    { 
	try { 
		FileOutputStream  fout = new FileOutputStream("contents.txt",true);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
   System.out.println("enter data");
   String s=br.readLine();
   char ch[] = s.toCharArray();
   for (int i = 0; i < s.length(); i++)
   {
    fout.write(ch[i]);   
   }System.out.println("data added");
}
	catch (Exception e) 
	{
	System.out.println("File Not Found");
	} }
}