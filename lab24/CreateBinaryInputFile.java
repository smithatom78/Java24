package lab24;
import java.io.*;
import java.nio.ByteBuffer;

public class CreateBinaryInputFile {
		    public static void main(String[] args) {
	        String fileName = "input.dat"; // Name of the binary file

	        try (FileOutputStream fos = new FileOutputStream(fileName)) {
	            // Example data to write
	            int intValue = 42;             // An integer
	            float floatValue = 3.14f;      // A float
	            char charValue = 'A';           // A character
	            String stringValue = "Hello";   // A string

	            // Write integer as 4 bytes
	            fos.write(ByteBuffer.allocate(4).putInt(intValue).array());
	            // Write float as 4 bytes
	            fos.write(ByteBuffer.allocate(4).putFloat(floatValue).array());
	            // Write character as 2 bytes
	            fos.write(ByteBuffer.allocate(2).putChar(charValue).array());
	            // Write string length (1 byte for length) and string bytes
	            byte[] stringBytes = stringValue.getBytes();
	            fos.write(stringBytes.length); // First byte is the length of the string
	            fos.write(stringBytes);         // Then the string itself

	            System.out.println("Binary file 'input.dat' created successfully.");
	        } catch (IOException e) {
	            System.err.println("An error occurred while creating the file: " + e.getMessage());
	        }
	    }
	}
