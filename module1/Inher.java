package m1;

class AA
{
int i;
AA(int x)
{i=x;
}
void show()
{System.out.println("i="+i);
}
}

class BB extends AA
{
int j;
BB(int x,int y)
{super(x);  //i=x  ok if no A constructor
//i=x;
j=y;
}
void show()
{//super.show();
System.out.println("i&j in B="+i+" "+j);
}
}
public class Inher {
public static void main(String args[])
{
BB ob=new BB(1,2);
ob.show();
}
}