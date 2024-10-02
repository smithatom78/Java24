package module3;
 import java.io.*;
class FileAddContent
{
public static void main(String args[]) throws IOException
{
	try {
//String source = "Welcome to Java World \n" + " Thank You\n";
//char buffer[] = new char[source.length()]; // allocate space equal to length of string
//source.getChars(0, source.length(), buffer, 0);
//copy the characters from position 0 to whole length(end) to buffer at position 0.
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("enter data");
String buffer=br.readLine();

FileWriter f1 = new FileWriter("sample.txt",true);
f1.write(buffer);
System.out.println("file contents added");
f1.close();
}
catch(Exception e)
    {
  System.out.println("Exception");
              }
}}

