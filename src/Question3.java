
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create an integer to store a number
        int FirstNumber;
        int SecondNumber;
        int ThirdNumber;
        int FourthNumber;

        // Enter different numbers on different lines
        System.out.println("Please enter in 4 numbers on separate lines ");
        FirstNumber = in.nextInt();
        SecondNumber = in.nextInt();
        ThirdNumber = in.nextInt();
        FourthNumber = in.nextInt();

         // Output our sentence to the user letting them know what they entered
        System.out.println("" + FirstNumber + "," + SecondNumber + "," + ThirdNumber + "," + FourthNumber);

        // finishing with the Scanner
        in.close();
    }
}
