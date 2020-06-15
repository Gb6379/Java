
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Type a word: ");
        backwards(word);
    }
    
    public static void backwards(String word) {
        int stringSize = word.length() - 1;
        for (int i = stringSize; i >= 0; i--) {
            System.out.println("String inverted: " + word.charAt(i));
        }
    }
    
}
