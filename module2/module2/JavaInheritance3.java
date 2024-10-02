package module2;
class Ant
{Ant(){System.out.println("Inside Ant No-Arg Constructor. ");}
  Ant(String name)
  {
    System.out.println("Inside Ant("+name+") Constructor. ");
  }
}
class WildAnt extends Ant
{
  WildAnt()
  {
    System.out.println("Inside WildAnt Constructor. ");
  }
}

public class JavaInheritance3
{
  public static void main(String[] args)
  {
  WildAnt wa = new WildAnt();
  Ant a=new Ant("MY Ant");
  }
}
