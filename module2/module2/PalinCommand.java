package module2;

public class PalinCommand {

    public static void main(String[] args) {
   
        int range1, range2;
     
        range1 = Integer.parseInt(args[0]);
        range2 = Integer.parseInt(args[1]);
        int num1 = 0;
        int num2 = 0;
        System.out.println(" palindrome numbers between "+range1 + " and " + range2 + " are");
        for (int i = range1; i <= range2; i++) {
            num1 = i;
            num2 = 0;
            while (num1 != 0) {
                int rem = num1 % 10;
                num1 /= 10;
                num2 = num2 * 10 + rem;
            }

            if (i == num2)
                System.out.print(i + " ");
        }
     
    }
}