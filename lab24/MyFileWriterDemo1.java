package lab24;
import java.io.*;
public class MyFileWriterDemo1 {
		    public static void main(String args[]) throws IOException {
	        try {
	        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				System.out.println("enter data");
				String buffer=br.readLine();
				FileWriter f1 = new FileWriter("sample.txt",true);
				f1.write(buffer);
	            f1.write("\n");
	            System.out.println("File contents added");
	            f1.flush();
	            f1.close();
	        } catch (Exception e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	}
