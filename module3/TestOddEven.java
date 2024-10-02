package module3;
import java.util.*;
import java.io.*;
public class TestOddEven {
	public static void main(String args[]){
		try{
			
 FileOutputStream f2=new FileOutputStream("odd.txt",true);
  FileOutputStream f3 = new FileOutputStream("even.txt",true);
		System.out.println("Enter an even or odd number:");
		Scanner sc = new Scanner(System.in);
		 int number = sc.nextInt();
		 if(number%2==0){
			    f3.write(number);
		 }
	
		 
		 else { 
			  f2.write(number);
		 }
		 } 
		 catch (Exception ex){
		 System.out.print("Caught-> "); 
		 System.out.println(ex.getMessage()); 
		 }
}
}