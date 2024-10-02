package module3;
import java.io.*;
public class BufferTest {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("enter 2 numbers");
		   int a=Integer.parseInt(br.readLine());
		   int b=Integer.parseInt(br.readLine());
		   System.out.println("The sum is "+(a+b));
		   
	}

}
