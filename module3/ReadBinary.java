package module3;
import java.io.*;
public class ReadBinary {
	    public static void main(String[] args) throws IOException{
	        String sourceFile = "file1.txt";  // The source binary file
	        String destinationFile = "file2.txt";  // The destination binary file

	        try (FileInputStream fis = new FileInputStream(sourceFile);
	             FileOutputStream fos = new FileOutputStream(destinationFile)) {
	             
	            byte[] buffer = new byte[1024]; // Buffer for file reading
	            int bytesRead;

	            // Read from source and write to destination
	            while ((bytesRead = fis.read(buffer)) != -1) {
	                fos.write(buffer, 0, bytesRead);
	            }

	            System.out.println("File copied successfully.");
	        } catch (IOException e) {
	            System.err.println("An error occurred during file operation: " + e.getMessage());
	        }
	    }
	}
