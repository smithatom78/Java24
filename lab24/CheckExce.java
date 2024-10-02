package lab24;
import java.io.*;
import java.util.Scanner;
public class CheckExce {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exists() && file.canExecute()) {
            System.out.println(fileName+" is Executable");
        } else {
            System.out.println("Not Executable");
        }    
        sc.close();
    }
}
