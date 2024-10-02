package m1;
abstract class Shape{
	 double h,w;
	Shape(double  height,double  width){
		h=height;
		w=width;
	}
	abstract double calculateArea();
	abstract double calculateCircumference();
}

class Rectangle1 extends Shape{
	double height;
	double width;
	Rectangle1(double height,double width)
	{super(height,width);}
	double getHeight(){
	 return height;
	}
	double getWidth(){
	return width;
	}
	void setHeight(double h) {
		height=h;
	}
	void setWidth(double w) {
		width=w;
	}
	/*Rectangle1(double height,double width){
		this.height=height;
		this.width=width;
	}*/
	double calculateArea() {
		return height*width;
	}
	
	double calculateCircumference() {
		return (height+width)*2;
	}

}
/*class Circle extends Shape{
	double radius;
	
	double getRadius() {
		return radius;
	}
	void setRadius(double r) {
		radius=r;
	}
	Circle(double r){
		radius=r;
	}
	double calculateArea() {
		return 3.14*radius*radius;
	}
	double calculateCircumference(){
		return 2*3.14*radius;
}
	
}

class Triangle1 extends Shape{
	double height;
	double base;
	
	double getHeight(){
		 return height;
		}
		double getBase(){
		return base;
		}
		void setHeight(double h) {
			height=h;
		}
		void setBase(double b) {
			base=b;
		}
	
	Triangle1(double h,double b){
		height=h;
		base=b;
	}
	double calculateArea() {
		return height*base*.5;
	}
	double calculateCircumference(){
		return (Math.sqrt((base*base)+(height*height))+base+height);
 }

}*/
public class AbstractDemo {
	public static void main(String[] args) {
	//	Rectangle1 r=new Rectangle1();
		Rectangle1 r=new Rectangle1(10,20);
	//	Circle c=new Circle(20);
		//Triangle1 t=new Triangle1();
		//t.setBase(4);
		  //  t.setHeight(8);
		r.setHeight(20);
		    r.setWidth(25);
		//Triangle1 t=new Triangle1(40,50);
		//    System.out.println("Area and circumference of Triangle by passing values through construtor");
			//System.out.println("Area:"+t.calculateArea());
			//System.out.println("Circumference:"+t.calculateCircumference());
			
		//System.out.println("Area and circumference of circle by passing values through construtor");
	//	System.out.println("Area:"+c.calculateArea());
	//	System.out.println("Circumference:"+c.calculateCircumference());
		
		System.out.println("Area and circumference of rectangle by passing values through construtor");
		System.out.println("Area:"+r.calculateArea());
		System.out.println("Circumference:"+r.calculateCircumference());
		
		
		//c.setRadius(5);
	    //System.out.println("radius of the circle is "+c.getRadius());
	    
	   
	  System.out.println("height and width the rectangle is "+r.getHeight()+" and "+r.getWidth());
	    
	    //t.setBase(4);
	    //t.setHeight(8);
	    //System.out.println("height and base of the triangle is "+t.getHeight()+" and "+t.getBase());
		
	}

}