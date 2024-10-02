package lab24;
import java.io.*;
public class DeleteMyFile {
    public static void main(String[] args)throws IOException {
        String fileName = "MyFile.txt"; 
        File file = new File(fileName);
        if (file.delete())
        {
            System.out.println("File deleted successfully.");
        } else 
        {
            System.out.println("Failed to delete the file.");
        }
    }
}
