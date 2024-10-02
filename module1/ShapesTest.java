package m1;
import java.util.Scanner;

 class Shapes
{protected double height,width;
	void SetValues(double height,double width)
	{this.height=height;
	this.width=width;
	}
}
class Rectangle extends Shapes
{
	double getArea()
	{return height*width;}
}
class BabyRectangle extends Rectangle
{
	double getArea()
	{return (height*width)/2;}
}
class Triangle extends Shapes
{
	double getArea()
	{return (height*width)/4;}
}
public class ShapesTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		BabyRectangle brect = new BabyRectangle();
		Triangle tri= new Triangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		float baseOfTriangle = sc.nextFloat();
		System.out.println("Enter the height of the triangle");
		float heightOfTriangle = sc.nextFloat();
	tri.SetValues(baseOfTriangle, heightOfTriangle);
	System.out.println("Area Triangle"+tri.getArea());
		System.out.println("Enter the base of Rectangle");
		float baseOfRectangle = sc.nextFloat();
		System.out.println("Enter the height of the Rectangle");
		float heightOfRectangle = sc.nextFloat();
	rect.SetValues(heightOfRectangle, baseOfRectangle);
	System.out.println("Area Rectgle"+rect.getArea());
	brect.SetValues(heightOfRectangle, baseOfRectangle);
	System.out.println("Area BabyRectgle"+brect.getArea());
	
	
	}

}
