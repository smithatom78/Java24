package module3;

import java.io.*;
public class FileOddEven {

    public static void main(String[] args) {
        int c;
        try{
            FileInputStream f1=new FileInputStream("Content.txt");
            FileOutputStream f2=new FileOutputStream("odd.txt",true);
            FileOutputStream f3 = new FileOutputStream("even.txt",true);
             while((c=f1.read())!=-1){
                if(c %2==0){
                	
                    f3.write(c);
                          }
                else{f2.write(c);}
           
            }
            FileInputStream fin = new FileInputStream("odd.txt"); 
            System.out.println("Contents of ODD file");
            while((c=fin.read())!=-1) 
			{
            	char c1 = (char)c;
    			System.out.print(c1);
			
			}
            FileInputStream fin1 = new FileInputStream("even.txt"); 
            System.out.println("Contents of Even file");
            while((c=fin1.read())!=-1) 
			{
            	char c1 = (char)c;
    			System.out.print(c1);
			
			}
            f1.close();
            f2.close();
            f3.close();
        }
        catch(FileNotFoundException e1){
           System.out.println(e1.getMessage());
        }
        catch(IOException e){
        	  System.out.println(e.getMessage());
        }
       
    }

}
