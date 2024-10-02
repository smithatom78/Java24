package lab24;
public class ExceptionDemo {
	public static void main(String[] args) {
        try {
        	String str = null;
          	str.length(); 
            int result = 10 / 0; 
           
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
