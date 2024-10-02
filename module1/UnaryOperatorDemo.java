package module1;
class UnaryOperatorDemo 
{	public static void main(String[] args) {
		int counter = +1;     
		//+ sign is the unary plus operator, which indicates that the value is positive
        System.out.println(counter);
        counter--;        // counter is now 0
        System.out.println(counter);
        counter++;        // counter is now 1
        System.out.println(counter);
        counter = -counter;       
        // counter is now -1
        System.out.println(counter);
	}
}
