package module2;
//import java.util.Scanner;
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