
package areaofkitemethod;
import java.util.Scanner;

public class AreaOfKiteMethod {

    public static void main(String[] args) {
        //This program calulates the area of a kite by utilizing the formula
        //area = 1/2 base * height.
        
        System.out.println("This program will calculate the total area of your "
                + "kite in inches.");
        Scanner input = new Scanner(System.in);
        
        //
        System.out.print("Please enter, from one angle to it's opposite angle, "
                + "the length of your kite in inches: ");
        int lengthKite = input.nextInt();
        System.out.print("Now please enter the width, from angle to opposite "
                + "angle, of your kite in inches: ");
        int widthKite = input.nextInt();
        
        //Output holding arguments.
        System.out.println("The total area of your kite is " + area(lengthKite,
                widthKite) + " inches.");
    }
        //Method conducting the computation.  return type = double, method name
        //= area, formal parameters = lengthKite, widthKite.
    public static double area(double lengthKite, double widthKite){
        double result;
        
        result = .5 * (lengthKite * widthKite);
        
        return result;
    }
}
