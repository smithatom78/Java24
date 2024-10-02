package module2;
import java.util.Scanner;
//This class declares an object of type Box.
class BoxDemo {
	public static void main(String args[])
	{
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