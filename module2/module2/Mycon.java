package module2;
class Myclass5
{int var1;
//no-arg constructor
Myclass5()
{    var1=10;
}
int getvalue()
{return var1;
}
}

public class Mycon
 {
public static void main(String ar[])
{
Myclass5 m=new Myclass5();
System.out.println("VAR1="+m.getvalue());
}
}
