package module2;
class Shape{
	protected double height, width;
	Shape(){}	
 Shape(double height,double width) {
	this.height =height;
	this.width =width;
	}
	/*
	void setValues(double height,double width) {
	this.height =height;
	this.width =width;
	}*/
}
class Rectangle extends Shape {
	Rectangle(double height,double width){
		super(height,width);
	}
	/*Rectangle(double height,double width) {
		this.height =height;
		this.width =width;
		}*/
	public double calculateArea() {
		double area = height*width;
		return area;
	}	
}
class Triangle extends Shape {
	Triangle(double height,double width){
		super(height,width);
	}
	/*Triangle(double height,double width) {
		this.height =height;
		this.width =width;
		}*/
	public double calculateArea() {
		double area = height*width/2;
		return area;
	}	
}
public class ProtectedTest {

	public static void main(String[] args)
	{
		
	//	Rectangle r=new Rectangle ();
	//	r.setValues(10,20);
		Rectangle r=new Rectangle (10,20);
		System.out.println("Rectangle AREA -"+r.calculateArea());
		Triangle t=new Triangle(2,20);
		System.out.println(" Triangle AREA -"+t.calculateArea());
	}
}
