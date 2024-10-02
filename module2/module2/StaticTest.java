package module2;
class Student
{	int rollno;
	String name;
static String college="SJC";
Student(int r,String n)
	{rollno=r;
	name=n;
	}
void display()
	{
	System.out.println(rollno+"\t"+name+"\t "+college)	;
	}
}
public class StaticTest {
public static void main(String[] args) 
{
	Student s1=new Student(111,"Aryan");
	Student s2=new Student(112,"Karan");
	s1.display();
	s2.display();
	System.out.println(s1.rollno);
	System.out.println(s1.name);
	
	System.out.println(Student.college);
}
}
