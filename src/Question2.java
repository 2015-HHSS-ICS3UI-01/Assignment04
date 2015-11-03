
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner for input
        Scanner input = new Scanner(System.in);
        
        //Find how many centimeters the users wish to convert
        System.out.println("Please enter the measurement in inches you wish to convert");
        
        //Create variables
        double inches = input.nextDouble();
        double centimeters = 2.54 * inches;
        
        //Tell the user the total
        System.out.println("" + inches + " inches is " + centimeters + " centimeters");
        
        
    }
}
