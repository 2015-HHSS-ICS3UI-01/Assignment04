
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
        
        Scanner numberInput = new Scanner(System.in);
        
        System.out.println("Enter number to convert to cenitmeters:");
        
        
        double inches = numberInput.nextDouble();
        
        double centimeter = (inches*2.54);
        
        System.out.println(inches + " inches in centimeters is " + centimeter + " centimeters");
                
        
        
    }
}
