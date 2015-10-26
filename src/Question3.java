
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will read for numbers and then display them on a line together
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // tell the user to enter 4 different numbers on 4 different lines to collect them
        System.out.println("Please enter in 4 numbers on seperate lines:");
        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberThree = input.nextDouble();
        double numberFour = input.nextDouble();
        
        // display the numbers on a line together
        System.out.println("Your numbers were " + numberOne + ", " + numberTwo + ", " + numberThree + ", and " + numberFour);
        
        // close input scanner
        input.close();
    }
}
