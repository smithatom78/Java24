package lab24;
import java.io.*;
class MyFileReader {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("input.txt");
        int i;
        while ((i = fr.read()) != -1) 
        {
            System.out.print((char) i);
        }
        fr.close();
    }
}
