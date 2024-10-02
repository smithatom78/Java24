package module2;
class Test1 {
int a;
Test1(int i) 
{
a = i;
}
Test1 increase() 
//Test1 increase(Test1 ob) 
{
Test1 temp = new Test1(a+10);
//Test1 temp = new Test1(ob.a+10);
return temp;
} 
}
public class RetObj {
public static void main(String args[])
{
Test1 ob1 = new Test1(2);
System.out.println("ob1.a: " + ob1.a);
Test1 ob2;
//ob2 = ob1.increase(ob1);
ob2 = ob1.increase();
System.out.println("ob2.a: " + ob2.a);
//ob2 = ob2.increase (ob2);
ob2 = ob2.increase ();
System.out.println("increase ob2.a: " +ob2.a); } }
