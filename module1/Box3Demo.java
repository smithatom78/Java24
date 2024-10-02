package m1;
import java.util.Scanner;
class Box3
{
int w,d,h;
	Box3(int height,int width,int depth)
	{	
		w=width;
		d=depth;
		h=height;
	}
int volume() 
	{	
	 return(w*d*h);
	}
}
public class Box3Demo {
	public static void main(String[] args) {
		System.out.println("Enter the height, width and depth:");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width= sc.nextInt();
		int depth = sc.nextInt();
		Box3 b3 = new Box3(height,width,depth);	
		int vol=b3.volume();
		System.out.println("w="+b3.w+",d="+b3.d+",h="+b3.h);
		System.out.println("vol="+vol);	
	}
}
