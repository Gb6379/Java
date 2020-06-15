
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
public class vector {
    
    public static void main(String[] args) {
            
          show();
       
    }
    
    public static int readNumber(){
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
        
        return number;
    }
    
    public static int[] store(){
        
        int vector[] = new int [100];
        int value = readNumber();
        for (int i = 0; i < 100; i++) {
            vector[i] = value;
            value++;           
        }
        
        return vector;
    }
    
    public static void show(){
        int vect[] = store();
        
        for (int i = 0; i < 100; i++) {
            if(vect[i] % 2 == 0){
                System.out.println("Vector pairs: " + vect[i]);
            }
        }
    }
    
    
}
