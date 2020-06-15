
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
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       show();
    }   
    
    public static int getNumber(){
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
       
       return number; 
    }
    
    public static int calculate(){
        int value = getNumber();
        int fat;
        for ( fat = 1; value > 1; value = value -1) {
            fat = fat * value;
            
        }
        return fat;
    }
    
    public static void show(){
        System.out.println("Result: " + calculate());
     
    }
}
