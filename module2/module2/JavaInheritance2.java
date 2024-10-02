package module2;
class Processor
{
  Processor()
  {
    System.out.println("Inside Processor() Constructor. ");
  }
}
class I3Processor extends Processor
{
  I3Processor()
  {
    System.out.println("Inside I3Processor() Constructor. ");
  }
}
class I5Processor extends I3Processor
{
  I5Processor()
  {
    System.out.println("Inside I5Processor() Constructor. ");
  }
}

public class JavaInheritance2
{
  public static void main(String[] args)
  {
    I5Processor i5 = new I5Processor();
  }
}
