package m1;
class Outer1
{int outer_x;
	void outerDisplay()
	{//Inner1 ob1=new Inner1();
	//ob1.innerDisplay();
		System.out.println("hello from outer");
		System.out.println("outer_x="+outer_x);
		//System.out.println("inner_y in outer="+ob1.inner_y);
	}
	class Inner1
	{int inner_y;
		void innerDisplay()
		{
		System.out.println("hello from Inner");
		System.out.println("inner_y="+inner_y);
		System.out.println("outer_x in Inner="+outer_x);
		}
	}
}
public class InnerClassDemo {

public static void main(String[] args) {
	
Outer1 obj=new Outer1();
obj.outer_x=100;
obj.outerDisplay();
Outer1.Inner1 obj1=obj.new Inner1();
obj1.inner_y=200;
obj1.innerDisplay();	
	}

}
