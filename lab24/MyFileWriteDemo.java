package lab24;
import java.io.*;
public class MyFileWriteDemo {
		    public static void main(String[] args) throws IOException{
	      
	        String content = "This is the University Exam for OODP.\nThis is a program to illustrate the use of files.";
	        FileWriter f1 = new FileWriter("MyFile.txt");
			f1.write(content);
            System.out.println("File contents added");
            f1.flush();
	       
	    }
	}
