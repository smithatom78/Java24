package module2;
class Person1
{
String Name,Gender;
int Age;
Person1(String n,String g,int a)
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
class employee1 extends Person1
{
String Company;
employee1(String n,String g,int a,String c)
	{ super(n,g,a);
	
	 Company=c;
			}

void cshow()
{
System.out.println("Company:"+Company);
}
}

class programmer1 extends employee1
{
int Salary;
programmer1(String n,String g,int a,String c,int s)
{super(n,g,a,c);
//reusing the base class members

Salary=s;
}
void sshow()
{
System.out.println("Salary:"+Salary);
}
}
public class Multi {
public static void main(String args[])
{
 programmer1 pp=new programmer1("xyz","Female",25,"CTS",25000);
pp.show();
pp.cshow();
pp.sshow();
}}
