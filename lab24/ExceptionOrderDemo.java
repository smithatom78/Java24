package lab24;

public class ExceptionOrderDemo {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("A");
        }catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        } 
    }
}
