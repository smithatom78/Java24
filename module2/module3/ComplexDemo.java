package module3;
import java.util.*;
 class Complex {
    double realPart;
    double imgPart;

    public Complex(){
        realPart = 0;
        imgPart = 0;
    }
    public Complex(double real , double img){
        realPart = real;
        imgPart = img;
    }

    public Complex add(Complex num){
        Complex result = new Complex();
       result.realPart = this.realPart + num.realPart;
       result.imgPart = this.imgPart + num.imgPart;
       return  result;
    }

    public Complex subtract(Complex num){
        Complex result = new Complex();
        result.realPart = this.realPart - num.realPart;
        result.imgPart = this.imgPart - num.imgPart;
        return  result;
    }

    public Complex multiply(Complex num){
        Complex result = new Complex();
        result.realPart = this.realPart * num.realPart;
        result.imgPart = this.imgPart * num.imgPart;
        return  result;
    }

    public Complex divide(Complex num){
        Complex result = new Complex();
        result.realPart = this.realPart / num.realPart;
        result.imgPart = this.imgPart / num.imgPart;
        return  result;
    }

    public void setRealPart(double real){
        this.realPart = real;
    }

    public void setImgPart(double img){
        this.imgPart = img;
    }

    public double getRealPart(){
        return this.realPart;
    }

    public double getImgPart(){
        return this.imgPart;
    }

    public String toString(){
         String result = this.realPart + " + "+ this.imgPart+"i";
        System.out.println(result);
         return  result;
    }

}

 public class ComplexDemo{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter real:");
		int a = sc.nextInt();
		System.out.print("Enter imaj:");
		int b = sc.nextInt();
        Complex c1 = new Complex();
        c1.setRealPart(a);
        c1.setImgPart(b);
        System.out.print("real for c2:");
		a = sc.nextInt();
		System.out.print("imaj for c2:");
		b = sc.nextInt();
        Complex c2 = new Complex(a,b);
        System.out.println("Number1: "+c1.getRealPart()+"+"+c1.getImgPart()+"i");
        
        System.out.println("Number2: "+c2.getRealPart()+"+"+c2.getImgPart()+"i");
        Complex c3 = new Complex();

        c3 = c1.add(c2);
        System.out.print("Sum: ");
        c3.toString();
        c3 = c2.subtract(c1);
        System.out.print("Difference: ");
        c3.toString();
        c3 = c1.multiply(c2);
        System.out.print("Product: ");
        c3.toString();
        c3 = c2.divide(c1);
        System.out.print("Quotient: ");
        c3.toString();

        
    }
}