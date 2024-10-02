package lab24;
import java.io.*;
public class MyFileWriterDemo2{
		    public static void main(String args[]) throws IOException {
	        try {
		       	FileWriter fw = new FileWriter("sample.txt");
		        fw.write("Hello, this is an example of FileWriter.\n");
	            fw.flush();
	            fw.close();
	          System.out.println("File writing completed.");
			     }
	        catch (IOException e)
	        { System.out.println("An  occurred while writing to the file.");
			          e.printStackTrace();}
	        }}

