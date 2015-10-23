/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author mitrm7692
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a new Scanner
        Scanner input = new Scanner(System.in);
        
        // Make Scanner ask for any 4 digits
        System.out.println("Please enter in 4 numbers on separate lines");
        
        //Enter first number (can be a decimal)
        String One = input.next();
        
        //Enter second number (can be a decimal)
        String Two = input.next();
        
        //Enter third number (can be a decimal)
        String Three = input.next();
        
        //Enter fourth number (can be a decimal)
        String Four = input.next();
        
        //Print out numbers in order
        System.out.println(One+", "+Two+", "+Three+", "+Four);
        
    }
}
