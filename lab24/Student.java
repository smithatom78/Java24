package lab24;

import java.util.Scanner;

//Student Class
public class Student {
 private int score;

 public Student(int score)throws InvalidScoreException {
     if (score < 0 || score > 100) {
         throw new InvalidScoreException("Score must be between 0 and 100.");
     }
     else
     {this.score = score;
    	 System.out.println("The score of the student"+score);
     }
     
 }

 public static void main(String[] args) {
     try {Scanner sc=new Scanner(System.in);
 	System.out.println("enter the score of the student");
 	int score =sc.nextInt();
    	  Student student = new Student(score); // Invalid score
     } catch (InvalidScoreException e) {
         System.out.println(e.getMessage());
     }
 }
}
