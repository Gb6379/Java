/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        initilize();
        
        
    }
    
    static void initilize(){
        int matrix [][] = new int [5][7];
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 7; column++) {
                System.out.println("matrix" + matrix[row][column]);
                
            }
            
        }
    }
    
}
