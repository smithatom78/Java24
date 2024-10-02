package Rem24;
class Complex {
    private double realPart;
    private double imaginaryPart;

    // Default constructor
    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    // Parameterized constructor
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Method to add two complex numbers
    public Complex add(Complex otherNumber) {
        double real = this.realPart + otherNumber.realPart;
        double imaginary = this.imaginaryPart + otherNumber.imaginaryPart;
        return new Complex(real, imaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex otherNumber) {
        double real = this.realPart - otherNumber.realPart;
        double imaginary = this.imaginaryPart - otherNumber.imaginaryPart;
        return new Complex(real, imaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex otherNumber) {
        double real = this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart;
        double imaginary = this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart;
        return new Complex(real, imaginary);
    }

    // Method to divide two complex numbers
    public Complex divide(Complex otherNumber) {
        double denominator = otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart;
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        double real = (this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart) / denominator;
        double imaginary = (this.imaginaryPart * otherNumber.realPart - this.realPart * otherNumber.imaginaryPart) / denominator;
        return new Complex(real, imaginary);
    }

    // Method to display complex number in a+bi format
    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + (-imaginaryPart) + "i";
        }
    }
}

public class CompleDemo {
	 public static void main(String[] args) {
	        // Create complex numbers
	        Complex c1 = new Complex(3, 2);
	        Complex c2 = new Complex(1, 7);

	        // Perform arithmetic operations
	        Complex sum = c1.add(c2);
	        Complex difference = c1.subtract(c2);
	        Complex product = c1.multiply(c2);
	        Complex quotient = null;

	        try {
	            quotient = c1.divide(c2);
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }

	        // Display results
	        System.out.println("Complex Number 1: " + c1);
	        System.out.println("Complex Number 2: " + c2);
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        if (quotient != null) {
	            System.out.println("Quotient: " + quotient);
	        }
	    }
}
