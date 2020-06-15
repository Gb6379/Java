
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
public class Vector {
    
    public static void main(String[] args) {
        
       
        readNumber();
    }
    
    public static int readNumber(){
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
        
        return number;
    }
    
    public static int store(){
        
         int size = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
         int vector[] = new int [size];
         int n = readNumber();
         
        for (int i = 0; i <size; i++) {
            if(n % 2 == 0){
                vector[n] = i;
            }
            
        }
        
        return vector[n];      
        
    }
    
    public static void show(){
        System.out.println("printing vector of pairs: " + store());
    }
}
