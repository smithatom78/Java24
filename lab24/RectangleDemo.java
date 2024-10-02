package lab24;

import java.util.Scanner;

//Class representing a Rectangle
class Rectangle {
 double length;
 double breadth;

 // Parameterized constructor to initialize the dimensions
 Rectangle(double length, double breadth) {
     this.length = length;
     this.breadth = breadth;
 }
 // Method to calculate the area of the rectangle
 public double calculateArea() {
     return length * breadth;
 }

 // Method to display dimensions
 public void displayDimensions() {
     System.out.println("Length = " + length);
     System.out.println("Breadth = " + breadth);
 }
}

//Main class to demonstrate the Rectangle class
class RectangleDemo {
 public static void main(String[] args) {
     // Create a Scanner object for user input
     Scanner sc = new Scanner(System.in);

     // Prompt the user to enter dimensions of the rectangle
     System.out.println("Please enter the length and breadth of the rectangle:");
     double length = sc.nextDouble();
     double breadth = sc.nextDouble();

     // Create an instance of the Rectangle class with the given dimensions
     Rectangle rect1 = new Rectangle(length, breadth);

     // Display the dimensions and area of the first rectangle
     System.out.println("Original Rectangle:");
     rect1.displayDimensions();
     System.out.println("Area: " + rect1.calculateArea());
//COPY VALUE OF ALREADY INITIALIZED INSTANCE TO ANOTHER OBJECT
    Rectangle rect2 = rect1;
     // Display the dimensions and area of the copied rectangle
     System.out.println("Copied Rectangle:");
     rect2.displayDimensions();
     System.out.println("Area: " + rect2.calculateArea());

     rect1.length = length + 2;
     rect1.breadth = breadth + 1; 
     System.out.println("Modified Original Rectangle:");
     rect1.displayDimensions();
     System.out.println("Area: " + rect1.calculateArea());

     // Display the copied rectangle's dimensions and area to show it remains unchanged
     System.out.println("Copied Rectangle After Original is Modified:");
     rect2.displayDimensions();
     System.out.println("Area: " + rect2.calculateArea());
 }
}
