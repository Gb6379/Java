
import javax.swing.JOptionPane;


public class MotorCycle extends Vehicle {
    
    public String style;
    
    
    public void getInfo() {
        this.model = this.getModel();
        this.plate = this.getPlate();
        this.year = this.getYear();
        this.style = JOptionPane.showInputDialog("MotorCycle Style: "); 
    }
    
    public void showInfo(){
        System.out.println("Model: " + this.model + "\nPlate: " + this.plate + "\nYear: " + this.year + "\nType: " + "MotorCycle" + "\nDoors: " + this.style);      
    }
    
        

}
