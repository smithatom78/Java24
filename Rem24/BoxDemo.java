package Rem24;

import java.util.Scanner;
class Box 
{
int w,d,h;
double volume() 
	{	
	System.out.print("vOLUME=");
	return(w*d*h);
	}
void display()
{System.out.println("Height="+h);
System.out.println("Depth="+d);
System.out.println("Width="+w);
}
}

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the height, width and depth of the box:");
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double width= sc.nextDouble();
		double depth = sc.nextDouble();
		Box myBox = new Box();
		double volume =myBox.volume();
		System.out.println("Volume of the box with dimensions: "+height+"* "+depth+" *"+width+" is :"+volume);
	
	}

}
