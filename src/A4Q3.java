
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String num;

        // Ask the user to enter their numbers, which become stored!
        System.out.println("Please enter in 4 numbers on seperate lines.");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        double fourth = input.nextDouble();

        // Output the numbers in order which the user had inserted them
        System.out.println("Your numbers were " + first + ", " + second + ", " + third + ", and " + fourth + ".");
    }
}
