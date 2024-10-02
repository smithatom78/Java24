package module4;
public class CreateThreadDemo1 extends Thread{

	public void run(){  
	    System.out.println("My first thread is in running state.");  
	  }   
	  public static void main(String args[])  {
		CreateThreadDemo1 obj=new CreateThreadDemo1();
		  obj.start(); 
		 
	  }  
}
