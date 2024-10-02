package module2;
class A
{ int i,j;
A(int i,int j)
{this.i=i;
this.j=j;
}
void show()
	{
	System.out.println("i&j in A ="+i+" "+j);
	}
}
class B extends A
{int k;
	B(int i,int j,int k)
	{
     super(i,j);
	this.k=k;
	}
	void show()
	{super.show();	
	System.out.println("i,j&k in B ="+i+" "+j+" "+k);	
	}
}
public class Inher {
public static void main(String args[]){
 	B ob=new B(2,4,6);
	//ob.i=1;
	//ob.j=2;
	//ob.k=3;
	ob.show();

}}


