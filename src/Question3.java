
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 4 numbers.");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        
        System.out.println("Your numbers were " + number1 + ", " + number2 +
                ", " + number3 + ", " + number4 + ". ");
    }
}
