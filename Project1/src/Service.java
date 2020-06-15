import java.util.Arrays;
import javax.swing.JOptionPane;

public class Service {
    public int price;
    public int dueTime;
    
    
    public static int chooseService(int type) {
      int s = Integer.parseInt(JOptionPane.showInputDialog("(1)carWash (2)Maintenance (3)Trade vehicle"));
      if(type == 3) {
          return s = Integer.parseInt(JOptionPane.showInputDialog("(1)carWash (2)Maintenance (3)Trade vehicle (4) unload "));
      }
     return s;
    }
    
    
    
   
    
}
