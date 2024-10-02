package m1;

public class BoxDemo {

	public static void main(String[] args) 
	{
		Box b1=new Box();
		b1.w=20;
		b1.d=10;
		b1.h=60;
		int vol=b1.volume();
		System.out.print(vol);
	}

}
