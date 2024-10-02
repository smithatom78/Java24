package module3;
import java.io.*;
public class FTest
{ public static void main(String[] args) throws IOException 
 
 { 
	File fin = new File("even2.txt"); 
	  if(fin.createNewFile())
	  {
	  System.out.println("created ");
	  }else
	  {
		System.out.println("Already exists");
	  }
  } 
}