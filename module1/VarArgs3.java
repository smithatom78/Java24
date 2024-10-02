package m1;

public class VarArgs3 
{
static void test(int ... v) 
{
System.out.println("test(int ...): " + "Number of args: " + v.length);
}
static void test(boolean ... v) 
{
System.out.println("test(boolean ...) " +"Number of args: " + v.length);
}
public static void main(String args[])
{
test(1, 2, 3);
test(true, false);
}}
