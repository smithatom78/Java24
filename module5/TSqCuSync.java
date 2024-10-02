package module5;
import java.util.Random;
import java.util.Scanner;
class Thread1 extends Thread{
 public void run(){
 Random rand = new Random();
 int i=0;
 while(i<10){
 int rand_num = rand.nextInt(100);
// System.out.println(rand_num);
 try{
 if(rand_num%2==0){
 Thread2.run(rand_num);
 i++;
 } else{
 Thread3.run(rand_num);
i++;
 }
 }catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
 }
 }
class Thread2 extends Thread{
 //evenThread
 public static void run(int n) throws
InterruptedException {
 System.out.println("Square of "+n+" is:"+n*n);
 Thread.sleep(1000);
 }
}
class Thread3 extends Thread{
 //oddThread
 public static void run(int n) throws
InterruptedException {
 System.out.println("Cube of "+n+" is:"+n*n*n);
 Thread.sleep(1000);
 }
}
public class TSqCuSync {
 public static void main(String[] args) {
 Thread1 t1 = new Thread1();
// Thread2 t2 = new Thread2();
 t1.start();
 }
}