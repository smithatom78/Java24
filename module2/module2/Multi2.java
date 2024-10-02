package module2;
class Person
{
String Name,Gender;
int Age;
Person(String n,String g,int a)
{
Name=n;
Gender=g;
Age=a;
}
void show()
{
System.out.println("Name:"+Name+"\nAge:"+Age+"\nGender: "+Gender);
}
}
class employee11 extends Person
{
String Company;
employee11(String n,String g,int a,String c)
{ super(n,g,a);
	Name=n;
	Gender=g;
	Age=a;
	 Company=c;
	}
void cshow()
{
System.out.println("Company:"+Company);
}
}

class programmer extends employee11
{
int Salary;
programmer(String n,String g,int a,String c,int s)
{super(n,g,a,c);
//reusing the base class members
Salary=s;
}
void sshow()
{
System.out.println("Salary:"+Salary);
}
}
public class Multi2 
{
public static void main(String args[])
	{
		programmer pp=new programmer("xyz","Female",25,"CTS",25000);
		pp.show();
		pp.cshow();
		pp.sshow();
	}
}
