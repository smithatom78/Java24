package module1;
import java.util.Scanner;
public class Student 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of students");
      int no=sc.nextInt();
      int r[] = new int[no];
      int m1[] = new int[no];
      int m2[] = new int[no];
      int m3[] = new int[no];
      double avg[] = new double[no];
      double sum[] = new double[no];
      int marks=0;
      for(int i=0; i<no; i++){
         System.out.println("Enter Roll no");
         r[i]=sc.nextInt();
         System.out.println("Enter mark in sub1");
         m1[i]=sc.nextInt();
         System.out.println("Enter mark in sub2");
         m2[i]=sc.nextInt();
         System.out.println("Enter mark in sub3");
         m3[i]=sc.nextInt();
      }
      for(int i= 0; i<no; i++){
        sum[i]=m1[i]+m2[i]+m3[i];
        avg[i]=sum[i]/3;
      }
      System.out.println("Rno\t mark1\tmark2\tmark3\ttotal \t avg");
      for(int i= 0; i<no; i++){
        System.out.println(r[i]+"\t"+m1[i]+"\t"+m2[i]+"\t"+m3[i]+"\t"+sum[i]+"\t"+avg[i]);
       
     }
   }
}