package module3;
import java.io.FileWriter;
import java.io.IOException;
class FileAddDemo
{
	public static void main(String[] args) throws IOException
	{
		String str = "File Handling in Java using "+
				" FileWriter and FileReader";

		FileWriter fw=new FileWriter("output.txt");
		// read character wise from string and write
		// into FileWriter
		for (int i = 0; i < str.length(); i++)
			fw.write(str.charAt(i));

		System.out.println("Writing successful");
	fw.close();
	}
}
