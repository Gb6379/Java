
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
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value1 = Integer.parseInt(JOptionPane.showInputDialog("Type the fisrt value"));
        int value2 = Integer.parseInt(JOptionPane.showInputDialog("Type the second value"));
        switch(menu()){
            case 1:
                System.out.println("The sum result is: " + sum(value1,value2));
                break;
            case 2:
                System.out.println("The abstraction result is: " + abstraction(value1,value2));
                break;
            case 3: 
                System.out.println("The multiplication result is: " + multiply(value1,value2));
                break;
            case 4:
                System.out.println("The split result is: " + split(value1,value2));
                break;
        }
    }
    
    public static int sum(int v1, int v2){
        
        return v1 + v2;
    }
    
    public static int abstraction(int v1, int v2){
        
        return v1 - v2;
    }
    
    public static int multiply(int v1, int v2){
        
        return v1 * v2;
    }
    
    public static int split(int v1, int v2){
        
        return v1/v2;
    }
    
    public static int menu(){
        int menu = Integer.parseInt(JOptionPane.showInputDialog("Type (1) for +\n (2) for -\n (3) for *\n (4) for /\n"));
        
        return menu;
    }
    
}
