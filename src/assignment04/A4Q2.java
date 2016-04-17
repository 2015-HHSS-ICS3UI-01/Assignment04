/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int inches;
                Scanner input = new Scanner(System.in);
                
                System.out.println("Please enter the measurement in inches you wish to convert");
                inches = input.nextInt();
                double centimeters = (inches*2.54);
                System.out.println(inches + " inches is the same as " + centimeters + "cm");
                
    }
}
