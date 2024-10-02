package module3;

import java.io.*;
public class FEx6  {
//copy content from input to output
	   public static void main(String args[]) throws IOException {  
	          try {
	   FileInputStream in = new FileInputStream("file2.txt");
	   FileOutputStream out = new FileOutputStream("file1.txt");
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	         System.out.println("file contents copied");
	      }catch(Exception e)
	          {
	        System.out.println("Exception");
	                    }}
	   }
