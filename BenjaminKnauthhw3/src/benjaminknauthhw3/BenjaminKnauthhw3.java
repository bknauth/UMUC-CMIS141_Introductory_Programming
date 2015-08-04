
package benjaminknauthhw3;
import java.util.Scanner;
import java.util.Arrays;

public class BenjaminKnauthhw3 {

  
    public static void main(String[] args) {
    
        double[] numberList = new double[10];
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + numberList.length + " values: ");
        for (int i = 0; i < numberList.length; i++)
            numberList[i] = input.nextDouble();
        
        java.util.Arrays.sort(numberList);
        
        System.out.println(Arrays.toString(numberList));
    }
}
