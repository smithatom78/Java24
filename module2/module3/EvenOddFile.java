package module3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class EvenOddFile {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		try{

			FileReader fin = new FileReader("content.txt");
			BufferedReader br = new BufferedReader(fin);
			String inp = br.readLine();
			FileWriter oddfr = new FileWriter("odd2.txt");
			FileWriter evenfr = new FileWriter("even2.txt");
			System.out.println("inp= " + inp); 
			for(String element: inp.split(" ")){
				if(Integer.parseInt(element)%2==0) {
					evenfr.write(element+" ");
				}
				else {
					oddfr.write(element+ " ");
				}
			}
			fin.close();
			oddfr.close();
			evenfr.close();
			}
			catch(IOException e){
			System.out.println(e.getMessage());
			}
	}

	
}