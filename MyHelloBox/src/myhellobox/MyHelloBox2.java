/*
 *This program displays "What's going on, my name is Benjamin!" Inside a 
 * message box.
 */
package myhellobox;
import javax.swing.JOptionPane;

public class MyHelloBox {
    public static void main (String [] args) {
        JOptionPane.showMessageDialog (null, "Howdie!", JOptionPane.INFORMATION_MESSAGE);
    }
}