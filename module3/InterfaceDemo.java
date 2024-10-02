package module3;
interface University
{	String univ="KTU";
	static void getUniversity()
	{
		System.out.println("My University is "+univ);
	}
}
interface College
{
	public String getCollege();	
}
interface Department
{
	public String getDepartment();	
}
class Hostel
{
	String hostel;
	public String getHostel()
	{
		return hostel;
	}

}
class Student11 extends Hostel implements College,Department,University 
//supports multiple inheritance
{String collegeName;
String deptName;
Student11(String hostel,String collegeName,String deptName)
{this.hostel=hostel;
this.collegeName=collegeName;
this.deptName=deptName;
}
public String getCollege()
	{
		
		return collegeName;
	}
	public String getDepartment()
	{
		
		return deptName;
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Student11 s=new Student11("St.Thomas","SJCET","CSE");
		String col=s.getCollege();
		String dep=s.getDepartment();
		University.getUniversity();//static method.no object is needed to invoke the method
		String hostel=s.getHostel();
		System.out.println("My college is "+col+"\nI belongs to "+dep+" Department\nI am staying in "+hostel);
	}

}
