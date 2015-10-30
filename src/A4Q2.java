
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number you wish to convert from Inches to Centimeters");
       
        
        int inches = input.nextInt();
        double centimeters = 2.54 * inches; 
        
        System.out.println( inches + " inches is the same as " + centimeters + " centimeters");
                
    }
}
