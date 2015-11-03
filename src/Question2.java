
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner numberInput = new Scanner(System.in);
        //request number to be converted
        System.out.println("Enter number to convert to cenitmeters:");
        //assign input to variable 'inches'   
        double inches = numberInput.nextDouble();
        //do math to convert number; assign result to variable 'centimeter'
        double centimeter = (inches*2.54);
        //output converted number
        System.out.println(inches + " inches in centimeters is " + centimeter + " centimeters");
                
        
        
    }
}
