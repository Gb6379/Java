import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String message1 = "Congrats you grasp it";
        String message2 = "Try guessing further to the right";
        String message3 = "Try guessing further to the left";
      
        int coin = generatingPosition();
        
        populating(coin);
        int tryes = 5;
        
        while(tryes !=0){
            int grasp = playerInput();
            if(checking(coin,grasp) == 1){
                tryes--;
                System.out.println(message2);
            } else if (checking(coin,grasp) == 2) {
                tryes--;
                System.out.println(message3);
            } else if(checking(coin,grasp) == 0) {           
              System.out.println(message1);
              break;
            } 
        }
        if(tryes == 0){
             System.out.println("You runned out of tryes");
        }
    }
    
    public static int generatingPosition() {
        int random = (int)(Math.random() * 20);
        return random;
    }
    
    public static int playerInput() {
        return Integer.parseInt(JOptionPane.showInputDialog("Try to grasp in which cup is the coin hidden"));
    }
    
    public static void populating(int coin){
        int vector[] = new int[21];
        for (int i = 1; i < 21; i++) {
             vector[coin] = 5;            
            System.out.println("|-|\t " + "cup " + i + " value " + vector[i]);
        }       
    }
    
    public static int checking(int coin, int grasp){
        if (grasp < coin){
            return 1;
        } else if (grasp > coin){
            return 2;
        } else  {
           return 0;
        }
    }
    
}
