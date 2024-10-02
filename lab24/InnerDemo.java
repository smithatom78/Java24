package lab24;
class Outer2 
{	int outer_x = 100;
	void test()
	{
	for(int i=0; i<5; i++)
	 	{ 
		System.out.println("outer"+i);
		}
	Inner inner = new Inner();
	inner.display(); 
	}
	class Inner 
	{  void display()
		{
		System.out.println("display: outer_x = " + outer_x);
		}  
	}
}     
class InnerDemo 
{
	public static void main(String args[]) 
	{
		Outer2 outer = new Outer2();
		outer.test();
	}
}
