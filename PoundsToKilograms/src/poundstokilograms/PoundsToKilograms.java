
package poundstokilograms;

public class PoundsToKilograms {

    
    public static void main(String[] args) {
      //Heading.
        System.out.println("Pounds       Kilograms");
      //Display data by multiplying puounds * 2.2 inside a For Loop.
        for (int i = 1; i <= 20; i++) {
            double kilograms = i * 2.2;
            System.out.println(i + "            " + (int)(kilograms *100) / 100.00);
        }  
    }
}
