package module3;
import java.io.*;
public class AddLineNumber {
	    public static void main(String[] args)throws IOException {
	        int lineNumber = 1;
	        FileReader fr = new FileReader("input.txt");
			BufferedReader br=new BufferedReader(fr);
			String line;
			     while ((line = br.readLine()) != null) {
	                System.out.println(lineNumber + ": " + line);
	                lineNumber++;
	            }
	    }
	}
