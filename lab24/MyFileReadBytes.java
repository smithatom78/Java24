package lab24;
import java.io.*;
public class MyFileReadBytes {
	    public static void main(String[] args)throws IOException {
	        String fileName = "input.txt"; 
	        FileInputStream fis = new FileInputStream(fileName);
	            int byteValue;
	            while ((byteValue = fis.read()) != -1) {
	                System.out.print(byteValue + " "); 
	            }
	       
	    }
}