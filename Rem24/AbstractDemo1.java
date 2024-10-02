package Rem24;
import java.util.Scanner;

abstract class GeometricShapes {
    abstract void numberOfSides();
   }
class MyTriangle extends GeometricShapes {
    int sides; // A triangle always has 3 sides
    MyTriangle(int sides) {
        this.sides = sides;
}
    void numberOfSides() {
        System.out.println("I am a Triangle. I have " + sides + " sides.");
        int sum = (sides - 2) * 180; // Using the formula to calculate sum of angles
        System.out.println("Sum of Angles = " + sum);
    }
  }
 class MyRectangle extends GeometricShapes {
  int sides; // A rectangle always has 4 sides
   MyRectangle(int sides) {
      this.sides = sides;
}
     void numberOfSides() {
        System.out.println("I am a Rectangle. I have " + sides + " sides.");
        int sum = (sides - 2) * 180;
        System.out.println("Sum of Angles = " + sum);
    }
}
  class MyHexagon extends GeometricShapes {
	   int sides; // A hexagon always has 6 sides
	   MyHexagon(int sides) {
		      this.sides = sides;
		}
		    
	    void numberOfSides() {
	        System.out.println("I am a Hexagon. I have " + sides + " sides.");
	        int sum = (sides - 2) * 180;
	        System.out.println("Sum of Angles = " + sum);
	    }
	    }
public class AbstractDemo1 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        boolean continueMenu;

	        do {
	            // Prompt user for the number of sides
	            System.out.println("Enter the number of sides for the geometric shape:");
	            int sides = sc.nextInt();
	            GeometricShapes shapes = null;

	            if (sides == 3) {
	                shapes = new MyTriangle(sides);
	            } else if (sides == 4) {
	                shapes = new MyRectangle(sides);
	            } else if (sides == 6) {
	                shapes = new MyHexagon(sides);
	            } else {
	                System.out.println("Shape with " + sides + " sides is not supported.");
	            }

	            // Display the number of sides and sum of angles for the shape
	            if (shapes != null) {
	                System.out.println("Shape with " + sides + " sides:");
	                shapes.numberOfSides();
	            }
	            System.out.println("Do you want to continue? (yes/no):");
	            String response = sc.next();
	            continueMenu = response.equalsIgnoreCase("yes");

	        } while (continueMenu);

	        sc.close();
	        System.out.println("Exiting program. Goodbye!");
	    }
	}


