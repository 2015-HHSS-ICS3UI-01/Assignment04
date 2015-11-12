
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a number in inches");
        Scanner input = new Scanner (System.in);
        double inches = input.nextInt();
        double cm = (inches * 2.54);
         System.out.println("in cm it is " + cm);
        
        
    }
}
