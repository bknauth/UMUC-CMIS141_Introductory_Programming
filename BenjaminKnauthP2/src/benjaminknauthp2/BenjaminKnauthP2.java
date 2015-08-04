
package benjaminknauthp2;
import javax.swing.JOptionPane;

public class BenjaminKnauthP2 {

public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Welcome to the Counting, Sum, and"
               + " Averages Program!");
       float sum = 0;
       int count = 0;
     
       sumMethod(sum, count);
}
    //Sum Method.  This method inherits all other methods since it needs to 
    //output two variables; sum, and count.
    public static void sumMethod(float sum, int count){
            
            float data = 1;  //Variable data cannot = 0 at this point.  Value 
                             //gets discarded when variable inherits 
                             //dataMethod().
            count = -1;      //Accounts for 0 not being counted as input.
            while (data != 0){
              data = dataMethod();  
              sum += data;
              count++;
              
            }
            //Condition Statement.
            if(sum > 100)
            JOptionPane.showMessageDialog(null, "Warning! You have entered a "
                    + "sum greater than 100!");
            
            float average = averageMethod(count, sum);
            
            statementMethod(count, sum, average);
    }
    
    //Input Method.
        public static float dataMethod(){
            
            String resultString = JOptionPane.showInputDialog("Enter any "
                    + "number, positive or negative, integer or decimal.  "
                    + "Keep the digit count under 6 for more accurate reuslts."
                    + "  0 cannot be accepted as a value.  Hit 0 when you are "
                    + "done.");
            float result = Float.parseFloat(resultString);
            return result;
        }
        
     //Average Method.   
        public static float averageMethod(int count2, float sum2){
        
            float average = (sum2 / count2);
            return average;
        }
        
     //Final Statement Method.   
        public static void statementMethod(int count3, float sum3, float 
                average3){
            
            JOptionPane.showMessageDialog(null, "You have entered " + count3 
               + " numbers.  The total of these numbers is " + sum3 + "."
               + "The average of your values is " + average3 + ".");
        }
}

