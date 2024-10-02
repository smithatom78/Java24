package module2;
class s1
{
int data=50;
	void say()
	{ System.out.println("Base Say\n -Data in S1="+data);
	}
}
class s2 extends s1
{int data=100;
	void say()
	{  // System.out.println("Derived---\nDisplay S1 Data in S2="+super.data);
		super.say();
		System.out.println("Data in Derived="+data);
	}
}
public class Inher1
{
	public static void main(String args[])
	{	
	//s1 ob=new s1();
	//s1 ob=new s2();
	s2 ob=new s2();
	ob.say();
	
	}
}
