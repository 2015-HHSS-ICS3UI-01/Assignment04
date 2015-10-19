
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program to convert inches into cm

        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // first ask the measurements that you want to convert
        System.out.print("Please enter the measurement in inches you wish to convert: ");
        
        // collecting user measurement in inches
        double inchesMeasurement = input.nextDouble();
        
        // converting user measurement from inches to cm
        double cmMeasurement = 2.54 * inchesMeasurement;
        
        // displaying the converted measurement
        System.out.println(inchesMeasurement + " inches is the same as " + cmMeasurement + " cm");
        
        // close input scanner
        input.close();
    }
    
}
