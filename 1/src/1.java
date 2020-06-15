
import java.util.Random;
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Do you wanna set the number of sides your dice is gonna have (1) Yes (2) No? (default = 6 sides)"));
        int sides = choice(choice);
        int times = Integer.parseInt(JOptionPane.showInputDialog("Type how many times do you wanna roll the dice: "));
        roll(times, sides);
    }
    
    public static void roll(int times, int sides){
        Random random = new Random();
        for (int i = 0; i <= times; i++) {
             System.out.println("Move: " + (i+1) + " Value: " + (random.nextInt(sides)+1));       
        }
        
    }
    
    public static int choice(int choice){
        int def = 6;
        if(choice == 1){
            int sides = Integer.parseInt(JOptionPane.showInputDialog("Type how many side your dice will have: "));
            return sides;
        } else {
            return def; 
        }
    }
    
}
