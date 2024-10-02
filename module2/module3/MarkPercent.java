package module3;
import java.util.*;
abstract class Mark{
	int m1,m2,m3,m4;
	abstract void getPercentage();
}
class A extends Mark{
	
	A(int m1,int m2,int m3){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void getPercentage() {
		System.out.println("Mark percentage of STUDENT A\n"+(m1+m2+m3)/3);
		}
	
}
class B extends Mark{
	
	B(int m1,int m2,int m3,int m4){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
	}
	void getPercentage() {
		System.out.println("Mark percentage of STUDENT B\n"+(m1+m2+m3+m4)/4);
	}
}

public class MarkPercent {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("STUDENT1: ");
		
		System.out.println("mark of first subject: ");
		int a=sc.nextInt();
		System.out.println("mark of second subject: ");
		int b=sc.nextInt();
		System.out.println("mark of third subject: ");
		int c=sc.nextInt();
		A ob1=new A(a,b,c);
		ob1.getPercentage();
		System.out.println("STUDENT2: ");
		System.out.println("mark of first subject: ");
		a=sc.nextInt();
		System.out.println("mark of second subject: ");
		b=sc.nextInt();
		System.out.println("mark of third subject: ");
		c=sc.nextInt();
		System.out.println("mark of forth subject: ");
		int d=sc.nextInt();
		B ob2=new B(a,b,c,d);
		ob2.getPercentage();
		sc.close();

	}

}
