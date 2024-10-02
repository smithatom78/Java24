package m1;
import java.util.Scanner; 
public class Abbreviate {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Firstname");
	      String firstName = sc.next();
	      System.out.println("Enter Middlename");
		     
	      String middleName = sc.next();
	      System.out.println("Enter Lastname");
		     
	      String lastName = sc.next();
	      char middleInitial = middleName.charAt(0);
	      char firstInitial = firstName.charAt(0);
	      
	      if (middleName.length() > 0 && lastName.length() == 0)   {
	         lastName = middleName;
	         System.out.println(firstInitial + ". " + lastName);   }
	     
	      else if (lastName.length() > 0) {
	         System.out.println(firstInitial + "." + middleInitial + "."+lastName );  }

	      
	 }
	}

