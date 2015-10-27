
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create an integer to store a number
        int number;

        // Asking the user what number they want to convert
        System.out.println("Please enter the measurement in inches you wish to convert");
        number = in.nextInt();

        // Output our sentence to the user letting them know what they entered
        System.out.println(number + " inches is the same as " + (number * 2.54) + "cm");

        // finishing with the Scanner
        in.close();

    }
}
