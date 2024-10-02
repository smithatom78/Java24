package module3;
import java.io.*;
public class Ex{
public static void main(String [] args) throws IOException  {int i=0;
try {// create new file input stream
FileInputStream fin = new FileInputStream("sample.txt");
System.out.println(fin.available()); // available bytes
// read till the end of the stream
while((i=fin.read())!=-1) 
{
//Converts Byte to Character
char c = (char)i;
System.out.print(c);
}}
catch (Exception e) 
{
System.out.println("File Not Found");
}}}
