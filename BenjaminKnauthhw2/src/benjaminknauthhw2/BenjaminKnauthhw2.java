
package benjaminknauthhw2;


public class BenjaminKnauthhw2 {

    public static void main(String[] args) {
        
        
        System.out.println("100 randomly generated numbers and their sum:");
        double sum = 0;
        
        for (int i = 1; i <= 100; i++){
            double x = Math.random() * 1000 - 1;
            
            if (x > 99)
            System.out.println((int)x);
            
            sum = sum + x;
        }
        System.out.println("The sum off all 100 numbers is " + (int)sum + ".");
  }
}
