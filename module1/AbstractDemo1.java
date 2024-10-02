package m1;
import java.util.*;
abstract class Student1{
	String name,dept,batch;
	long regno;
	double cgpa;
	abstract void calcgpa();
	Student1(String name,String dept,String batch,long regno){
		this.name=name;
		this.dept=dept;
		this.batch=batch;
		this.regno=regno;		
	}
	
}
class Btech extends  Student1{
	Btech(String name,String dept,String batch,long regno){
		super(name,dept,batch,regno);
		}
	
	double cgpacom(double s1,double  s2,double  s3,double  s4,double  s5,double  s6,double  s7,double  s8) 
	{
		this. cgpa=(s1+s2+s3+s4+s5+s6+s7+s8)/8;
		return cgpa;
	
	}
	
 	void calcgpa(){
 		
 		
 		System.out.println(name+"\t"+dept+"\t"+"\t"+batch+"\t"+regno+"\t"+cgpa);
 		
		
	}
	
}
class Mca extends Student1{
	
	
		
	Mca(String name,String dept,String batch,long regno){
		super(name,dept,batch,regno);
	
	}
	double cgpacom(double s1,double s2,double s3,double s4,double s5,double s6) {
		this. cgpa=(s1+s2+s3+s4+s5+s6)/6;
		return cgpa;
	
	}
	
 	void calcgpa(){
 		
 		
 		System.out.println(name+"\t"+dept+"\t"+"\t"+batch+"\t"+regno+"\t"+cgpa);
 		
		
	}
}
class Mba extends Student1{
	
		
	Mba(String name,String dept,String batch,long regno){
		super(name,dept,batch,regno);
	
	}
	double cgpacom(double s1,double s2,double s3,double s4) {
		this. cgpa=(s1+s2+s3+s4)/4;
		return cgpa;
	
	}
	
 	void calcgpa(){
 		
 		
 		System.out.println(name+"\t"+dept+"\t"+"\t"+batch+"\t"+regno+"\t"+cgpa);
 		
		
	}
	
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	  System.out.println("enter your name:");
	  String name=sc.nextLine();
	  System.out.println("enter your department:");
	  String dept=sc.nextLine();
	  System.out.println("enter your batch");
	  String batch=sc.nextLine();
	  System.out.println("enter your regno");
	  long no=sc.nextLong();
	 
	  Btech ob1=new Btech(name,dept,batch,no);
	  Mca ob2=new Mca(name,dept,batch,no);
	  Mba ob3=new Mba(name,dept,batch,no);
	 ob1.cgpacom(7.7, 8.8, 6.6,7.6, 8.6,8.9,9.2,9.5);
	  ob1.calcgpa();
	  ob2.cgpacom(8.5,9.0,8.4,7.8,8.3,8.5);
	  ob2.calcgpa();
	  ob3.cgpacom(9.0,8.76,8.95,9.2);
	  ob3.calcgpa();
	  

	}

}