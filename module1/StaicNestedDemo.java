package m1;
class Outer2
{
int outer_x = 100;
void test() {
Nested2 nested= new Nested2 ();
nested.display();
	System.out.println("Outer")	;
	nested.display();
}
static class Nested2 
{//static nested class
void display() {
  Outer2 obj = new Outer2();
System.out.println("display:  outer_x = " + obj.outer_x);
    }}
}

public class StaicNestedDemo {
public static void main(String args[]) {
Outer2 outer = new Outer2();
outer.test();

} }
