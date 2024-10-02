package module2;
class StaticTest1
{static
{System.out.println("first static block is invoked");
}
static
{System.out.println("second static block is invoked");
}
public static void main(String[] args) 
{
System.out.println("Hello main");
}}