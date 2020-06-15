
import javax.swing.JOptionPane;


public class Calculator {
    
    public int value1;
    public int value2;
    public int operation;
    
    public static int getOperation() {
        int operation = Integer.parseInt(JOptionPane.showInputDialog("Chose an operation:\n 1(+) 2(-) 3(*) 4(/) 5(exit)"));
        return operation;
    }
    
    public static int getNumber(){
        int value = Integer.parseInt(JOptionPane.showInputDialog("Type a number:"));
        return value;
    }
    
    public static int sum(int value1, int value2) {      
        return value1 + value2;
    }
    
    public static int substraction(int value1, int value2) {
        return value1 - value2;
    }
    
    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }
    
    public static int division(int value1, int value2) {
        return value1 / value2;
    }
    
}
