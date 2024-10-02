package m1;
import java.util.Scanner;
class Box1 
{
int w,d,h;
int volume(int w,int d,int h) 
	{
	this.w=w;
	d=d;
	h=h;
	System.out.println("w="+w+",d="+d+",h="+h);
	return(w*d*h);
	}
}
public class BoxDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the height, width and depth of the box:");
		Scanner sc = new Scanner(System.in);
		Box1 b1 = new Box1();	
		int he = sc.nextInt();
		int wi= sc.nextInt();
		int de = sc.nextInt();
		int vol=b1.volume(he,wi,de);
		System.out.println("w="+b1.w+",d="+b1.d+",h="+b1.h);
		System.out.println(vol);	
	}

}
