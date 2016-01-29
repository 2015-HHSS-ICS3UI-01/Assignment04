


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vickj2854
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create a scanner for input
        Scanner input = new Scanner(System.in);

        // Get the users name
        System.out.println("please enter the measurments in inches you wish to convert");
      
        double answer = input.nextDouble();
        
        double convert = answer* 2.54;
        
        
        System.out.println("Your answer is the same as " + convert + "cm");
        
        
        
        

    }
}