package module1;
import module2.X;
class Y extends X
{
	
	Y(int i,int j)
	{this.i=i;
	this.j=j;
	//System.out.println("i,j in X-"+i+" "+j);
	}
}
public class ProTest {
	public static void main(String[] args) {
		Y ob=new Y(3,4);
	//X ob=new X();
	//ob.i=1;
//ob.j=2;
	ob.display();
	//ob1.display();
	}

}
