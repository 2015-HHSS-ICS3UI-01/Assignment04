
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        
        //create a string
        String myString;
        
        //Make scanner ask for number
        System.out.println("Please enter the number of inches");
        
        //insert the number that need to be conervted from inches to cm
         double inches = input.nextDouble();
         
         //Multiply the number of inches to Cm
         double inchesToCm = inches*2.54;
         
         //Show how many inches are in centimeters
         System.out.println( inchesToCm + " Centimeter");   
    }
}
