
import javax.swing.JOptionPane;

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
        int matrix[][] = new int[5][7];
        int value = 10;

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 7; column++) {
                matrix[row][column] = value;
                value = value + 1;
                if (value == 30) {//when the matrix value gets to 30 it will leap to 50 and then keep increasing from 1 to 1
                    value = value + 50;
                }
            }
        }

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 7; column++) {
                System.out.println("matrix" + matrix[row][column]);

            }
        }

        String number = JOptionPane.showInputDialog("Type a number so we can check if it existis within our matrix");
        int userNumber = Integer.parseInt(number);
        String result;// only necessary if ternary is used.
        boolean exists = true;
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 7; column++) {
                /*result = matrix[row][column] == userNumber ? "It exists its on the" : "Doesnt exists";
                System.out.println(result + " row[" + row + "]"+ "column[" + column + "]");*/
                if (matrix[row][column] == userNumber) {
                    System.out.println("It exists and its on the line[" + row + "]and column[" + column + "]");
                }
                else{
                    exists = false;
                }
            }
        }
        if(!exists){
            System.out.println("It doesent exists");
        }
    }
}
