package m1;

 class A1 {
	 int i,j;
	void showij()
	{System.out.println("i&j="+i+" "+j);
	}}
	class A2 extends A1
	{int k;
	void showk()
	{System.out.println("i&j in B,k="+i+" "+j+" "+k);	}}//Error

	public class A {
	public static void main(String args[]){
	 	A2 ob=new A2();
		ob.i=1;
		ob.j=2;
		ob.k=3;
		ob.showij();
		ob.showk();
	}}


