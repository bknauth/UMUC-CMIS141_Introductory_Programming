
package formula;
import javax.swing.JOptionPane;

public class Formula {

    public static void main(String[] args) {
        //Enter weight.
        String weightOnEarthString = JOptionPane.showInputDialog(
                "Enter your weight in pounds.  Don't be shy:");
        //Convert to double.
        int weightOnEarth =
            Integer.parseInt(weightOnEarthString);
        //Calculate weight on the Moon.
        double weightOnMoon = weightOnEarth / 6.00;
        //Keep weight to two decimal places.
        weightOnMoon = (int)(weightOnMoon * 100) / 100.00;
        //Diplay weight on the moon.
        String results = "If your weight on Earth is " + weightOnEarth + " lbs "
                + "then your weight on the Moon is " + weightOnMoon + " lbs.  "
                + "That is the best weight loss plan in the solar system!";
        JOptionPane.showMessageDialog(null, results);
    }
}
