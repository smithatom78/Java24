package m1;
import lab21.PA;
//protected member can be accessed in subclass 
//outside the package
class PA1 extends PA
{	void mymethod()
	{System.out.println(msg); }
}

public class ATest {
	public static void main(String[] args) {
		 PA1 a=new PA1();  
		// System.out.println(a.msg);
		a.mymethod(); 
	}}
