package module1;
public class EnhancedForLoop {
	public static void main(String[] args)
		{
		int numbers[] = {1, 2, 3, 4, 5};
	      for(int x : numbers )
	      {
	    	 System.out.print( x );
	         System.out.print(",");
	      }
	      //end of for loop
	      System.out.print("\n");
	      
	      String [] names = {"January", "February", "March", "April"};

	      for( String name : names ) {
	         System.out.print( name );
	         System.out.print(",");
	      }//end of for loop
	}//end of main
}//end of class
