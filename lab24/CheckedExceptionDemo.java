package lab24;
import java.io.*;
import java.util.Scanner;
public class CheckedExceptionDemo{
    public static void main(String[] args) {
        try {
            File file = new File("mytestfile.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}