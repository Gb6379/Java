
import javax.swing.JOptionPane;
import java.util.Arrays;


public class Vehicle {
    
    public String model;
    public String plate;
    public int year;
    public int type;
     
    public String getModel() {
       return this.model = JOptionPane.showInputDialog("Type the vehicle model: ");
    }  
    
    public String getPlate() {
        return this.plate = JOptionPane.showInputDialog("Type the vehicle plate: ");
    }
    
    public int getYear() {
        return this.year = Integer.parseInt(JOptionPane.showInputDialog("Type the vehicle's year of fabrication: "));
    }
    
    public int getType() {
        return this.type = Integer.parseInt(JOptionPane.showInputDialog("Type the vehicle type: (1) Car (2) MotorCycle (3) Truck"));
    }
     
}
