package lab24;
class Outer1 {
    int outer_x = 50;
    void test() {
        System.out.println("outer_x = " + outer_x);
            }
    class Nested { // Inner class
        void display() {
            System.out.println("display: outer_x in Nested class = " + outer_x);
        }
    }
}
public class NonstaticNestedDemo {
    public static void main(String[] args) {
        Outer1 outer = new Outer1(); // Create an instance of Outer
        outer.test(); // Call test method which creates and uses an instance of Nested
       // Creating an instance of the inner class Nested correctly
        Outer1.Nested nested = outer.new Nested();
       nested.display(); 
    }
}

