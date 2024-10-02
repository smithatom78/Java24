package m1;
 class Furniture
{void show()
	{System.out.println("Made of Wood. ");}
 
}
class Sofa extends Furniture
{void addCushion()
	{System.out.println("Added Cushion");}

}
public class InherTest
{public static void main(String[] args)
{Furniture fur = new Furniture();
	Sofa s=new Sofa();
	System.out.println(fur);
	System.out.println(fur.toString());
	System.out.println(fur.getClass());
	System.out.println(fur.hashCode());
	System.out.println(fur.equals(fur));
	System.out.println(fur.equals(s));
}
}

//Output:Hello


