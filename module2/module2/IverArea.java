package module2;

import java.util.Scanner;
class Area1 {
    void calculateArea(float r) {
        float area = 3.14f*r*r;
        System.out.println("Area of Circle with radius: "+r+" is: "+area);
    }
    
    void calculateArea(float base, float height) {
        float area = 0.5f*base*height;
        System.out.println("Area of Triangle with base: "+base+" and height: "+height+" is: "+area);
    }
    
    void calculateArea(int width, int length) {
        int area = width*length;
        System.out.println("Area of Rectangle with width: "+width+" and length: "+length+" is: "+area);
    }
}

public class IverArea{
    public static void main(String [] args) {
        float base, height, radius;
        int rectWidth, rectHeight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base of the Triangle");
        base = sc.nextFloat();
        System.out.println("Enter the Height of the Triangle");
        height = sc.nextFloat();
        System.out.println("Enter the width of the Rectangle");
        rectWidth = sc.nextInt();
        System.out.println("Enter the Height of the Rectangle");
        rectHeight = sc.nextInt();
        System.out.println("Enter the Radius of the Circle");
        radius = sc.nextFloat();
        sc.close();
        
        Area1 area = new Area1();
        area.calculateArea(base, height);
        area.calculateArea(rectWidth, rectHeight);
        area.calculateArea(radius);
    }
}
