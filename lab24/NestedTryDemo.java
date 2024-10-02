package lab24;

public class NestedTryDemo {
	public static void main(String[] args) {
	        try {
	            try {
	                throw new ArithmeticException("Inner exception");
	            } catch (ArithmeticException e) {
	                System.out.println("Caught inner: " + e.getMessage());
	                throw new RuntimeException("Exception from inner catch");
	            }
	        } catch (RuntimeException e) {
	            System.out.println("Caught outer: " + e.getMessage());
	        }
	    }
	}

