
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
       show();
    }
    
    public static int getData(){
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
        
        return number;
    }
    
    public static int compare(){
        int n = getData();
        if(n % 2 == 0){ 
            return n * 2;
        } else {
            return n * 3;
        }              
    }
    
    public static void show(){
        int value =  compare();
        if(value % 2 == 0){
            System.out.println("number was multiplied 2x: " + value);           
        } else {
            System.out.println("number was multiplied 3x: " + value);
        }
    }
        
}
