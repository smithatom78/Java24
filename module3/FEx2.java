package module3;
import java.io.*;
public class FEx2{
public static void main(String [] args) throws IOException 
{int i=0;
// create new file input stream
FileInputStream fin = new FileInputStream("file1.txt");
System.out.println(fin.available()); 

while((i=fin.read())!=-1) 
{
	//Converts Byte to Character
	char c = (char)i;
//	int c = (int)i;
	System.out.print(c);
	}
}
}

