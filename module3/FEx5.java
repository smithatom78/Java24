package module3;
import java.io.*;
public class FEx5 {
	public static void main(String[] args) throws IOException 
{ 
FileInputStream fin = new FileInputStream("file1.txt"); 
InputStreamReader ir = new InputStreamReader(fin); 
BufferedReader br = new BufferedReader(ir); 
String line; 
int countWord = 0; 
int characterCount = 0; 
while((line = br.readLine()) != null) 
    { if(!(line.equals(""))) 
        { characterCount += line.length(); 
      String[] wordList = line.split(" ");
            countWord += wordList.length; 
        } }System.out.println("Total word count = " + countWord); 
System.out.println("Total characters = " + characterCount);}} 
