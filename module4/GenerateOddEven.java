package module4;
class OddNumbers extends Thread{
	public void run(){   
		for(int i=1;i<100;i+=2) {
			System.out.println("Odd Number Generated"+i);
		}
	}
}
class EvenNumbers extends Thread{
	public void run(){   
		for(int i=2;i<100;i+=2) {
			System.out.println("Even Number Generated"+i);
		}
	}
}
public class GenerateOddEven {
	public static void main(String[] args) {
		OddNumbers oddNumbers = new OddNumbers();
		EvenNumbers evenNumbers = new EvenNumbers();
		oddNumbers.start();
		evenNumbers.start();
		oddNumbers.setPriority(5); 
		evenNumbers.setPriority(8); 
	}

}
