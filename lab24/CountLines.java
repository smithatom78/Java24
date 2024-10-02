package lab24;
import java.io.*;
public class CountLines {
    public static void main(String[] args)throws IOException {
	        	        int lineCount = 0;
	        FileReader fr = new FileReader("input.txt");
            int i;
            while ((i = fr.read()) != -1) 
            {
                System.out.print((char) i);
            }
	        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
	            while (reader.readLine() != null) {
	                lineCount++;
	                  }
	            System.out.println("\nNumber of lines: " + lineCount);
	       
	    }
	}
