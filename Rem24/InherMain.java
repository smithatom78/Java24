package Rem24;
//Base class Shape
class Shape {
 protected double length;
 protected double breadth;
 // Method to display the dimensions
 public void show() {
     System.out.println("Length: " + length);
     System.out.println("Breadth: " + breadth);
 }
}

//Rectangle class that extends Shape
class Rectangle extends Shape {

 // Constructor for Rectangle
 public Rectangle(double length, double breadth) {
	 this.length = length;
	     this.breadth = breadth;
	
 }

 // Method to calculate the perimeter of the rectangle
 public double getPerimeter() {
     return 2 * (length + breadth);
 }

 // Method to calculate the area of the rectangle
 public double getArea() {
     return length * breadth;
 }
}

//Square class that extends Shape
class Square extends Shape {

 // Constructor for Square
 public Square(double side) {
     length=breadth=side;  // For a square, length and breadth are the same
 }

 // Method to calculate the perimeter of the square
 public double getPerimeter() {
     return 4 * length;
 }

 // Method to calculate the area of the square
 public double getArea() {
     return length * length;
 }
}

//Main class to test the Shape, Rectangle, and Square classes
public class InherMain {
 public static void main(String[] args) {
     // Create an instance of Rectangle
     Rectangle rect = new Rectangle(5.0, 3.0);
     System.out.println("Rectangle:");
     rect.show();
     System.out.println("Perimeter: " + rect.getPerimeter());
     System.out.println("Area: " + rect.getArea());

     // Create an instance of Square
     Square sq = new Square(4.0);
     System.out.println("\nSquare:");
     sq.show();
     System.out.println("Perimeter: " + sq.getPerimeter());
     System.out.println("Area: " + sq.getArea());
 }
}
