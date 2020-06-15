
import javax.swing.JOptionPane;


public class Truck extends Vehicle {
    
    public int maximumCapacity;
    public String kindofLoad;
    
    public void getInfo() {
        this.model = this.getModel();
        this.plate = this.getPlate();
        this.year = this.getYear();
        this.maximumCapacity = Integer.parseInt(JOptionPane.showInputDialog("Capacity in KG: "));
        this.kindofLoad = JOptionPane.showInputDialog("Type of load");
    }
    
    public void showInfo(){
        System.out.println("Model: " + this.model + "\nPlate: " + this.plate + "\nYear: " + this.year + "\nType: " + "Truck" + "\nLoad: " + this.kindofLoad + "\nCapacity: " + this.maximumCapacity);      
    }
}
