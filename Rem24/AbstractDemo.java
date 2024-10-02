package Rem24;
import java.util.Scanner;
abstract class Shape1 {
    abstract void draw();
    abstract double area();
    abstract double perimeter();
}
class Rectangle1 extends Shape1 {
    private double length;
    private double width;
    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void draw() {
        System.out.println("Drawing rectangle");
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}

class Circle1 extends Shape1 {
    private double radius;
    Circle1(double radius) {
        this.radius = radius;
    }
    void draw() {
        System.out.println("Drawing circle");
    }
    double area() {
        return Math.PI * radius * radius;
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // For Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Shape1 rectangle = new Rectangle1(length, width);
        rectangle.draw();
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        
        // For Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Shape1 circle = new Circle1(radius);
        circle.draw();
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Perimeter (circumference) of circle: " + circle.perimeter());
        
        scanner.close();
    }
}

