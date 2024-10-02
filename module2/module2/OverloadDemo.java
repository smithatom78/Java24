package module2;
public class OverloadDemo {
	void add(int number1, int number2) {
		int sum = number1 + number2;
		System.out.println("Sum of two numbers");
		System.out.println(number1+" + "+number2+" = "+sum);
	}
	void add(int number1,int number2, int number3) {
		int sum = number1 + number2+number3;
		System.out.println("Sum of three numbers");
		System.out.println(number1+" + "+number2+" + "+number3+" = "+sum);
	}
	public static void main(String[] args) {
		OverloadDemo add = new OverloadDemo();
		add.add(10, 20);
		add.add(10, 20, 30);

	}

}
