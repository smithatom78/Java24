package module2;
class Myclass2
{	int var1;
Myclass2()
	{  var1=10; }
Myclass2(int num)
	{ var1=num; }
int getvalue()
	{  return var1;}
}
public class MyCon1 {
public static void main(String args[])
{ Myclass2 m=new Myclass2();
Myclass2 m1=new Myclass2(50);
System.out.println("VAR1= "+m.getvalue());
System.out.println("VAR1= "+m1.getvalue());
}}
