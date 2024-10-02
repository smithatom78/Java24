package m1;
import java.util.Scanner;
abstract class marks {
	 double perc,sum;
	abstract void getpercentage();
	
}

class A11 extends marks
{ int m1,m2,m3;
 	void getpercentage()
	{  System.out.println(m1+" "+m2+" "+m3);
		//perc=((m1+m2+m3)/300)*100;
    double perc=((m1+m2+m3)/(double)300)*100;
	 System.out.println("percentage of student 1 is "+perc);
	}
}

class B1 extends marks
{ int M1,M2,M4,M3;
//double perc,sum;
	void getpercentage()
	{   sum=M1+M2+M3+M4;
		perc=(sum/400)*100;
		 System.out.println("percentage of student 2 is "+perc);
	}
}


public class StudentTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		A11 obj1=new A11();
		B1 obj2=new B1();
			System.out.println("\t\tStudent A\n\n");
			System.out.println("Enter the mark of 1st subject");
		obj1.m1=s.nextInt();
			System.out.println("Enter the mark of 2nd subject");
		obj1.m2=s.nextInt();
			System.out.println("Enter the mark of 3rd subject");
		obj1.m3=s.nextInt();
		System.out.println("\t\tStudent B\n\n");
			System.out.println("Enter the mark of 1st subject");
		obj2.M1=s.nextInt();
			System.out.println("Enter the mark of 2nd subject");
		obj2.M2=s.nextInt();
			System.out.println("Enter the mark of 3rd subject");
		obj2.M3=s.nextInt();
			System.out.println("Enter the mark of 4th subject");
		obj2.M4=s.nextInt();
			obj1.getpercentage();
		//obj2.getpercentage();
	}

}