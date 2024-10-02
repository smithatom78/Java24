package module3;
import java.util.Scanner;
class EvenNumberException extends Exception{
	private String message;
	public EvenNumberException(String msg) 
	{message=msg;
		}
	public String getMessage()
	{
		return message;
		}
} 
class OddNumberException extends Exception{
	public OddNumberException(String s){ 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 
public class UserDefinedExceptionDemo{
	public static void main(String args[]){
		try{
			System.out.println("Enter an even or odd number:");
			Scanner sc = new Scanner(System.in);
        	int number = sc.nextInt();
        	if(number%2==0)
        	{
        		throw new EvenNumberException("Even Number Exception"); 
        	}
        	else { 
                throw new OddNumberException("Odd Number Exception"); 
        	}
        } 
        catch (EvenNumberException e){
        	System.out.print("Caught-> "); 
            System.out.println(e.getMessage()); 
        } 
        catch (OddNumberException e){ 
            System.out.print("Caught ->");
            System.out.println(e.getMessage()); 
        } 
        
    } 
}
