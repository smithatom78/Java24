package module3;
import java.io.*;
import java.util.*;
public class FileCreateCopyDemo
{
public static void main(String args[]) throws IOException
{
try
{//creating file1 with  contents
	File fin1 = new File("file1.txt"); 
  if(fin1.exists())
  {
  System.out.println("file1 exists ");
   }else
  {
	fin1.createNewFile();
	System.out.println("created file1.txt");
	String s="Smitha Jacob is Your Java Teacher";
	FileWriter f = new FileWriter("file1.txt");
	f.write(s+"\nStudy Well");
	f.close();
	System.out.println("Written to file file1.txt");
  }
  //creating file2 without contents
  File fin2 = new File("file2.txt"); 
  if(fin2.exists())
  {
  System.out.println("file 2 exists ");
   }else
  {
	fin2.createNewFile();
	System.out.println("created file2.txt");
	}
  //copy content from file1 to file2
  FileInputStream in = new FileInputStream("file1.txt");
  FileOutputStream out = new FileOutputStream("file2.txt");
        int c;
        while ((c = in.read()) != -1) {
           out.write(c);
        }
        System.out.println("file contents copied from file1 to file2");
       
//read contents of file1
        System.out.println("**file contents of file 1**");
        BufferedReader br1 = new BufferedReader(new FileReader(fin2)) ;
        String content1;
        while ((content1=br1.readLine())!=null)
          {
            System.out.println(content1);
          }
      //read contents of file2
        System.out.println("**file contents of file 2**");
        BufferedReader br2 = new BufferedReader(new FileReader(fin2)) ;
        String content2;
        while ((content2=br2.readLine())!=null)
          {
            System.out.println(content2);
          }
}
catch(FileNotFoundException e)
{
System.out.println("File not found");
}
catch(Exception e)
{
System.out.println("Exception");
          }
} 
}
