package module2;
class Over1 {
void test() {
System.out.println("No parameters.");
}
// Overload test for one integer parameter.
float test (float a)

{System.out.println("float parameters.");
	return a;
}
int test(int a)
{System.out.println("int parameters.");
System.out.println("int a: " + a);
return a*a;
}

double test(double a)
{System.out.println("double parameters.");
System.out.println("double a: " + a);
return a*a;
}
}
public class Over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Over1 ob=new Over1();
double v=ob.test(10.5);
System.out.println(v);
 v=ob.test(10);
System.out.println(v);
v=ob.test(20.53);
System.out.println(v);
}

}
	