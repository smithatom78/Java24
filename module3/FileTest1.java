package module3;
import java.io.*;
public class FileTest1 {
	 
public static void main(String[] args)
{
 
try {
File file=new File("input.txt");
System.out.println(file.getAbsolutePath());
BufferedReader br = new BufferedReader(new FileReader(file)) ;
String content;
while ((content=br.readLine())!=null)
  {
    System.out.println(content);
  }
  br.close();
 
}
catch(IOException e) {
e.printStackTrace();
}
}
}