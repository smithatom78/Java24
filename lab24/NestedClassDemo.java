package lab24;

class Outer {
    int outer_x = 100;

    void test() {
        System.out.println("outer_x = " + outer_x);
        Nested nested = new Nested(); // Correctly creating the inner class instance within the method
        nested.display();
    }

    class Nested { // Inner class
        void display() {
            System.out.println("display: outer_x in Nested class = " + outer_x);
        }
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer(); // Create an instance of Outer
        outer.test(); // Call test method which creates and uses an instance of Nested
        
        // Creating an instance of the inner class Nested correctly
        Outer.Nested nested = outer.new Nested(); // Need an instance of Outer to create Nested
        nested.display(); // Call the display method on the Nested instance
    }
}
