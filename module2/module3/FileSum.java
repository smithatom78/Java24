package module3;
import java.io.*;
public class FileSum {
	static int sum=0;
	public static void main(String[] args)throws Exception {
	    try{
		 FileReader fr=new FileReader("sum3.txt");
	      int i,b=0;
	      
	      char [] nums=new char[200]; 
	      while((i=fr.read())!=-1)
	      {
	          nums[b]=(char)i;
	          b++;
	          
	      }
	      fr.close();
	     
	      String s=new String(nums);
	     System.out.println(s);
			  String[] numbers=s.split("\\s");
			  System.out.println(numbers.length);
		  for(int k=0;k<numbers.length;k++)
			  {		// System.out.println(numbers[k]);
			 				int num=Integer.parseInt(numbers[k]);
			 				 System.out.println(k+"="+num);
			 			//	System.out.println(numbers[k]);
				sum=sum+Integer.parseInt(numbers[k]);
				
				//	System.out.println(sum);
			  }
		//  System.out.println(num);
			 System.out.println("Sum="+FileSum.sum);
           
	    }

          
	    catch(Exception e){ 
		  
	  }
	   
}
}
