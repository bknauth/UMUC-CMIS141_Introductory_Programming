
package luckynumbers;
import javax.swing.JOptionPane;

public class LuckyNumbers {
    public static void main(String[] args) {
        //Input boxes for String variables.
        String firstName = JOptionPane.showInputDialog("Welcome to the Lucky "
                + "Number Program! Please start by entering your first name:");
        String middleInitial = JOptionPane.showInputDialog("Now would you "
                + "kindly enter you middle initial:");
        String lastName = JOptionPane.showInputDialog("Very good.  Please enter"
                + " your last name:");
        
        //Input boxes for String variables being converted into int variables.
        String ageUserString = JOptionPane.showInputDialog("Awesome!  So how "
                + "old are you?");
        int ageUser = Integer.parseInt(ageUserString);
        String luckyNumber1String = JOptionPane.showInputDialog("Great! Now "
                + "please enter the first of three lucky numbers:");
        int luckyNumber1 = Integer.parseInt(luckyNumber1String);
        String luckyNumber2String = JOptionPane.showInputDialog("Mine too! How"
                + " about the second number:");
        int luckyNumber2 = Integer.parseInt(luckyNumber2String);
        String luckyNumber3String = JOptionPane.showInputDialog("Amazing!  "
                + "Whats your last lucky number?");
        int luckyNumber3 = Integer.parseInt(luckyNumber3String);
        
        //First part of output box.
        String output1 = "Welcome " + firstName + " " +middleInitial + " " 
                + lastName + "!";
        
        //Second part of output box.
        String output2;
        
        if (ageUser <= 12)
            output2 = "You are just a kid!";
        else if (ageUser < 20)
            output2 = "Welcome teenager!";
        else if (ageUser == 20)
            output2 = "Welcome almost adult!";
        else
            output2 = "Welcome adult!";
        
        //Third part of output box.
        int luckyNumberAverage = (luckyNumber1 + luckyNumber2 + luckyNumber3)/3;
        
        String output3 = "The average of your 3 lucky numbers is: "
                + luckyNumberAverage;
        
        //Ouput boxes.
        JOptionPane.showMessageDialog(null, output1);
        JOptionPane.showMessageDialog(null, output2);
        JOptionPane.showMessageDialog(null, output3);
    }
}
