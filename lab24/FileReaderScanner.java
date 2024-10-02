package lab24;
import java.io.*;
import java.util.Scanner;
	public class FileReaderScanner {
	    public static void main(String[] args) {
	        try {
	        	FileInputStream fis = new FileInputStream("sample.txt");
	             Scanner sc = new Scanner(fis);
                int wordCount = 0;
	            while (sc.hasNext()) {
	                String word = sc.next();
	                System.out.println(word);
	                wordCount++;
	            }
	            System.out.println("Total number of words: " + wordCount);
	        } catch (IOException e) {
	            System.err.println("Error reading the file: " + e.getMessage());
	        }
	    }
	}