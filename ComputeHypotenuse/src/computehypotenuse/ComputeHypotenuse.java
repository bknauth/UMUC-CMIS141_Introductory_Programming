//This program computes the hypotenuse of a right triangle using the Pythagorian
//formula a^2 + b^2 = c^2.
package computehypotenuse;
import java.util.Scanner;
import java.lang.Math;

public class ComputeHypotenuse {
  public static void main(String[] args) {
    //Create scanner object.
    Scanner input = new Scanner(System.in);
    
    //Input
    System.out.print("Please enter one side of your right triangle that is not "
      + "the hypotenuse: ");
    double number1 = input.nextDouble();
    System.out.print("Please enter the other side of your right triangle that "
      + "is not the hypotenuse: ");
    double number2 = input.nextDouble();
    
    //Calculation.
    double calc1 = (number1 * number1) + (number2 * number2);
    double hypotenuse = Math.sqrt(calc1);
    
    //Output
    System.out.println("The square of " + number1 + " + the square of " + 
      number2 + " equals " + calc1 + " which is the square of " + hypotenuse 
      + ", which is the hypotenuse.");
    }
}
