package module3;

import java.io.*;
public class TestFileReader {
	
		public static void main(String args[]){
			try{
				FileReader fin_1 = new FileReader("file1.txt");
				FileReader fin_2 = new FileReader("file.txt");
				FileWriter fout = new FileWriter("file3.txt");
				int i;
				while((i=fin_1.read()) != -1){
					fout.write(i);
				}
				while((i=fin_2.read()) != -1){
					fout.write(i);
				}
				 System.out.println("file contents from 1 and 2  copied to file3 ");
				fin_1.close();
				fin_2.close();
				fout.close();
				
			}catch(FileNotFoundException e){
				System.out.println(e.getMessage());
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
	}

