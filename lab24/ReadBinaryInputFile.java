package lab24;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
public class ReadBinaryInputFile {
   public static void main(String[] args) {
	        String fileName = "input.dat"; // Name of the binary file
	        try (FileInputStream fis = new FileInputStream(fileName)) {
	            // Read integer (4 bytes)
	            byte[] intBytes = new byte[4];
	            fis.read(intBytes);
	            int intValue = ByteBuffer.wrap(intBytes).getInt();
	            System.out.println("Integer: " + intValue);
	            // Read float (4 bytes)
	            byte[] floatBytes = new byte[4];
	            fis.read(floatBytes);
	            float floatValue = ByteBuffer.wrap(floatBytes).getFloat();
	            System.out.println("Float: " + floatValue);

	            // Read character (2 bytes)
	            byte[] charBytes = new byte[2];
	            fis.read(charBytes);
	            char charValue = ByteBuffer.wrap(charBytes).getChar();
	            System.out.println("Character: " + charValue);

	            // Read string length (1 byte)
	            int stringLength = fis.read();
	            byte[] stringBytes = new byte[stringLength];
	            fis.read(stringBytes);
	            String stringValue = new String(stringBytes);
	            System.out.println("String: " + stringValue);

	        } catch (IOException e) {
	            System.err.println("An error occurred while reading the file: " + e.getMessage());
	        }
	    }
	}
