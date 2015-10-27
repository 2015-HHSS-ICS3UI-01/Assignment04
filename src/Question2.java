
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Created new scanner to read values
        Scanner in = new Scanner(System.in);
       
        // Stores integers
        int myInt;
        // Asks human for a number in inches
        System.out.println("Please enter the measurement in inches you wish to convert");
        myInt = in.nextInt();
        
        // HUMAN HERE's YOUR CM, BE SATISFIED WITH THINE RESULTS! BE GONE.
        System.out.println(myInt + " inches is the same as " + (myInt*2.54) + "cm");
         
      
          in.close();
    }
}
