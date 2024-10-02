package module1;
import java.util.Scanner;
//class
class Box{
	double height;
	double depth;
	double width;
Box(double height, double depth, double width) {
	this.height =height;
	this.width =width;
	this.depth = depth;
}
	public double calculateVolume() {
		double volume = height*depth*width;
		return volume;
	}
}
//This class declares an object of type Box.
class BoxDemo1 {
	public static void main(String args[]) {
		System.out.println("Please enter the height, width and depth of the box:");
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double width= sc.nextDouble();
		double depth = sc.nextDouble();
		Box myBox = new Box(height, width, depth);
	//	myBox.setDimension(height, width, depth);
		System.out.println("Height="+myBox.height);
		System.out.println("Depth="+myBox.depth);
		System.out.println("Width="+myBox.width);
		double volume =myBox.calculateVolume();
		System.out.println("Volume of the box with dimensions: "+height+"* "+depth+" *"+width+" is :"+volume);
	
	}
}