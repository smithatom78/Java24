package module2;
abstract class Shape1 {
	
abstract void numberofSides();
}

class Rectangle1 extends Shape1{
int side;
Rectangle1(int side){this.side=side;}
	void numberofSides()
	{
System.out.println("I am Rectangle, I have "+side+" sides");
}

}

class Triangle1 extends Shape1 
{int side;
Triangle1(int side){this.side=side;}

	void numberofSides()
	{
System.out.println("I am Triangle, I have "+side+" sides");
 }

}

class Hexagon1 extends Shape1 
{int side;
Hexagon1(int side){this.side=side;}
 
	void numberofSides()
	{
System.out.println("I am Hexagon, I have"+side+" sides");

}

}

public class Poly{

public static void main(String[] args)
{ 
Rectangle1 r=new Rectangle1(4);
Triangle1 t=new Triangle1(3); 
Hexagon1 h=new Hexagon1(6);
r.numberofSides();
t.numberofSides();
h.numberofSides();
}

}
