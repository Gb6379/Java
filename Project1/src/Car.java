
import javax.swing.JOptionPane;


public class Car extends Vehicle{
    
    public int doorNumber;
    public int steeringWheel;
    
    Service service = new Service();
       
    public void getInfo() {
        this.model = this.getModel();
        this.plate = this.getPlate();
        this.year = this.getYear();
        this.doorNumber = Integer.parseInt(JOptionPane.showInputDialog("Number of doors: ")); 
        this.steeringWheel = Integer.parseInt(JOptionPane.showInputDialog("(1)H (2)M: "));
    }
    
    public void showInfo(){
        System.out.println("Model: " + this.model + "\nPlate: " + this.plate + "\nYear: " + this.year + "\nType: " + "Car" + "\nDoors: " + this.doorNumber + "\nWheel :" + this.setWheel(steeringWheel));      
    }
     
    public String setWheel(int steeringWheel) {
        if(steeringWheel == 1) {
            return "Hydraulic";
        }
        return "Mechanic";
    }
    
    public void executeCarManutence1() {
        service.dueTime = 6;
        service.price = 80;
    }
    
   /* public int executeCarWash() {
        service.dueTime = 1;
        service.price = 50;
        
        return 
    }*/
    
    public void execteCarTrade() {
        
    }
    
  /*  public int execute(int serviceType) {
        return executeCarWash();
    }*/
  
     
}
