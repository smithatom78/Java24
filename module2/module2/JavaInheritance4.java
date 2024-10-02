package module2;
class Food
{
  void show()
  {
    System.out.print("FOOD ");
  }
}
class Bread extends Food
{
  void toast()
  {
    System.out.print("TOASTED ");
  }
}
public class JavaInheritance4
{
  public static void main(String[] args)
  {
    Food foo = new Food();
    foo.show();
    Food foo2 = new Bread();
    foo2.show();
    Bread br = new Bread();
    br.toast();
    br.show();
  }
}