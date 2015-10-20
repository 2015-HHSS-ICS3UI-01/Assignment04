
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make scanner
        Scanner input = new Scanner (System.in);
        
        //make variable for spaces moved
        int spaces = 1;
   
        while (spaces <= 100){
        //start moves
        System.out.println("Enter sum of dice. ");
        int sum = input.nextInt();
        
        spaces = spaces + sum;
        
            System.out.println("You are now on " + spaces);
        
    }
}}
