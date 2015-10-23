/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author mitrm7692
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a new Scanner
        Scanner input = new Scanner(System.in);
        
        // Make Scanner ask for name
        System.out.println("Please enter the number of inches");
        
        //enter  number of inches to be converted to Centimeters
        double inches = input.nextDouble();
        
        // Multiply the number of inches by the number of Centimeters in 1 inch
        double inchesToCm = inches*2.54;
        
        // Show how many Centimeters are in the number of inches
        System.out.println( inchesToCm + " Centimeters");
    }
}
