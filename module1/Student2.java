package m1;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Stud
{
String name;
int age;
float m1,m2,m3,totalmark;


	Stud()
	{
		name=" ";
		age=0;
		m1=m2=m3=0.0f;
		totalmark=0.0f;
	}

	 void setDetails(String name,int age,float m1,float m2,float m3)
	{
		this.name=name;
		this.age=age;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		totalmark=m1+m2+m3;
	}
	public void displayDetails()
	{
		System.out.print("\t"+name);
		System.out.print("\t"+age);
		System.out.print("\t"+m1);
		System.out.print("\t"+m2);
		System.out.print("\t"+m3);
		System.out.print("\t"+totalmark);
	}

}

public class Student2
{
public static void main(String args[])
{
int nstud=0;
int i=0;
int j=0;
Scanner read=new Scanner(System.in);
System.out.println("Enter the no of Students");
nstud=read.nextInt();
Stud s[]=new Stud[nstud];

	for(i=0;i<nstud;i++)
		{
			s[i]=new Stud();

		}
 
	for(i=0;i<nstud;i++)
		{
			System.out.println("Enter the details of ith studemt");
			System.out.println("Enter the name");
			 String name=read.next();

			System.out.println("Enter the  age of ith studemt");
			 int age=read.nextInt();
			System.out.println("Enter the mark1 of ith studemt");
			 float m1=read.nextFloat();
			System.out.println("Enter the mark2 of ith studemt");
			float m2=read.nextFloat();
			System.out.println("Enter the mark3 of ith studemt");
			float m3=read.nextFloat();
			//System.out.printf("%s%d%f%f%f",name,age,m1,m2,m3);
			s[i].setDetails(name,age,m1,m2,m3);
			//s[i].displayDetails();
		}
		System.out.println("\tname \tage \tmark1 \tmark2 \tmark3 \ttotal");
		for(i=0;i<nstud;i++)
		{
		s[i].displayDetails();
		System.out.println();	
		}

		//Sorting

	/*List<Stud> studs = new ArrayList<Stud>();		

	for(i=0;i<nstud;i++)
	{
	studs.add(s[i]);
	}
	System.out.println("Unsorted Collection : " +studs);
*/
		//sorting BY smith
//START OF SORT BY TOTAL
        sortStudentsByTotalMarks(s);

         System.out.println("\nStudents Sorted by Total Marks (Descending Order):");
        System.out.println("\tname \tage \tmark1 \tmark2 \tmark3 \ttotal");
        for (i = 0; i < nstud; i++) {
            s[i].displayDetails();
            System.out.println();
        }
    }

   public static void sortStudentsByTotalMarks(Stud[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].totalmark < students[j + 1].totalmark) {
                    // Swap students[j] and students[j+1]
                    Stud temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }	
        //END OF SORT BY NAME
		/*
		 //SORT BY NAME
		sortStudentsByName(s);

        // Print the sorted list
        System.out.println("\nStudents Sorted by Name (Ascending Order):");
        System.out.println("\tname \tage \tmark1 \tmark2 \tmark3 \ttotal");
        for (i = 0; i < nstud; i++) {
            s[i].displayDetails();
            System.out.println();
        }
    }

   public static void sortStudentsByName(Stud[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].name.compareToIgnoreCase(students[j + 1].name) > 0) {
                    // Swap students[j] and students[j+1]
                    Stud temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        //END OF SORT BY NAME
*/
		/*
		// SORT BY NAME using ARRAYLIST
        ArrayList<Stud> studentsList = new ArrayList<>();
 			for (i = 0; i < nstud; i++) {
            studentsList.add(s[i]);
        }

        // Call the  sorting function
        sortStudentsByName(studentsList);
    System.out.println("\nStudents Sorted by Name (Ascending Order):");
        System.out.println("\tname \tage \tmark1 \tmark2 \tmark3 \ttotal");
        for (Stud student : studentsList) {
            student.displayDetails();
            System.out.println();
        }
    }

    public static void sortStudentsByName(ArrayList<Stud> studentsList) {
        Collections.sort(studentsList, new Comparator<Stud>() {
           
            public int compare(Stud s1, Stud s2) {
                // Sort in ascending order of names (alphabetical order)
                return s1.name.compareToIgnoreCase(s2.name);
            }
        }); 
        	//END SORT BY NAME using ARRAYLIST
        */
/*
 	// SORT BY TOTAL using ARRAYLIST
        ArrayList<Stud> studentsList = new ArrayList<>();

        for (i = 0; i < nstud; i++) {
            studentsList.add(s[i]);
        }

        // Call the sorting function
        sortStudentsByTotalMarks(studentsList);

       
        System.out.println("\nStudents Sorted by Total Marks (Descending Order):");
        System.out.println("\tname \tage \tmark1 \tmark2 \tmark3 \ttotal");
        for (Stud student : studentsList) {
            student.displayDetails();
            System.out.println();
        }
    }

      public static void sortStudentsByTotalMarks(ArrayList<Stud> studentsList) {
        Collections.sort(studentsList, new Comparator<Stud>() {
            
            public int compare(Stud s1, Stud s2) {
                // Sort in descending order of total marks
                return Float.compare(s2.totalmark, s1.totalmark);
            }
        });
        //END OF SORT BY TOTAL using ARRAYLIST
   */
}
}