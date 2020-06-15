
import javax.swing.JOptionPane;
import java.util.Arrays;


public class Main {
   
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        MotorCycle motorcycle = new MotorCycle();
        Truck truck = new Truck();
        Service service = new Service();
        
        vehicle.getType();
        if (vehicle.type == 1) {
            car.getInfo();
            car.showInfo();
        } else if (vehicle.type == 2) {
            motorcycle.getInfo();
            motorcycle.showInfo();
        } else if (vehicle.type == 3) {
            truck.getInfo();
            truck.showInfo();
        }
       
                    
       
    }
 
}
