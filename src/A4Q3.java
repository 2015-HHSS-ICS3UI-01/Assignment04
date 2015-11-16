
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner to get user input
        Scanner in = new Scanner(System.in);
        
        //ask user for numbers 
           System.out.println("Please enter 4 numbers on different lines:");
         double firstnumber = in.nextDouble();
         double secondnumber = in.nextDouble();
         double thirdnumber = in.nextDouble();
         double fourthnumber = in.nextDouble();
         
         //output numbers
         System.out.println("Your numbers were " + firstnumber + ", " + secondnumber + ", " + thirdnumber +" and " + fourthnumber); 
         
        
        
    }
}
