
import javax.swing.JOptionPane;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Calculator calculator = new Calculator();
        
        do {
            calculator.operation = calculator.getOperation();
            if(calculator.operation == 5) {
                JOptionPane.showMessageDialog(null, "You've exited the program:");
                System.exit(0);
            }
            calculator.value1 = calculator.getNumber();
            calculator.value2 = calculator.getNumber();
        
             
            switch (calculator.operation) {
                case 1:
                     JOptionPane.showMessageDialog(null, "Sum result = " + calculator.sum(calculator.value1, calculator.value2));
                     break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Substraction result =" + calculator.substraction(calculator.value1, calculator.value2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Multiplication result = " + calculator.multiply(calculator.value1, calculator.value2));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Division result = " + calculator.division(calculator.value1, calculator.value2));
                    break;
            }  
        } while (calculator.operation != 5);
    }
   
}
