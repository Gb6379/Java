
import javax.swing.JOptionPane;


public class Main extends User{


    public static void main(String[] args) {
        
        Main myMain = new Main();
        
       myMain.name = JOptionPane.showInputDialog("Tipe your name ");
       myMain.email = JOptionPane.showInputDialog("Email");
       myMain.phone = Integer.parseInt(JOptionPane.showInputDialog("Phone"));
              
       JOptionPane.showMessageDialog(null, "\nName: " + myMain.name + "\nEmail: " + myMain.email + "\nPhone: " + myMain.phone);

    }
    
}
