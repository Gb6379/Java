
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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double side = Integer.parseInt(JOptionPane.showInputDialog("Type the side: "));
        double result = calculate(side);
        System.out.println("Result :" + Math.floor(result));
        
       
    }
    
    public static double calculate(double side) {
        double calculation = Math.pow(side, 3);
        return calculation;
    }
    
    
}
