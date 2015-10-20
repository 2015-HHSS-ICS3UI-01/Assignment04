
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //make scanner
        Scanner input = new Scanner (System.in);
        
        //tell user to input a value in inches to convert to centimetres
        System.out.println ("Type a value in inches");
        
        //variable for how many cm are in an inch
        double inch = 2.54;
        
        //read value from user
        double value =input.nextDouble();
        
        //covert value to cm
        double conversion = value*inch;
        
        //tell user conversion
        System.out.println(value+" inches is "+conversion+" cm" );
        
        //close scanner
        input.close();
    }
}
