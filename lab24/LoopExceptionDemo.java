package lab24;

public class LoopExceptionDemo {
		    public static void main(String[] args) {
	        for (int i = 0; i < 3; i++) {
	            try {
	                if (i == 1) {
	                    throw new RuntimeException("Exception at i = " + i);
	                }
	                System.out.println("i = " + i);
	            } catch (RuntimeException e) {
	                System.out.println("Caught: " + e.getMessage());
	            }
	   }
	}
}
