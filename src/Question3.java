
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user for four numbers
        System.out.println("Please enter in 4 numbers on seperate lines.");
        double one = input.nextDouble();
        double two = input.nextDouble();
        double three = input.nextDouble();
        double four = input.nextDouble();
        System.out.println("Your numbers were " +one+ ", " +two+ ", " +three+ ", " +four+ ".");
    }
}
