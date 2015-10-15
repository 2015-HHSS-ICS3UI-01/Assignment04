
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class Question03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make new scanner
        Scanner input = new Scanner(System.in);
        
        //asks user to input 4 numbers
        System.out.println("Please enter 4 different numbers on seperate lines:");
        int firstNumber = input.nextInt();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        double fourthNumber = input.nextDouble();
    
        //tells user their numbers in order
        System.out.print("Your numbers were " + firstNumber + ", ");
        System.out.print(secondNumber + ", ");
        System.out.print(thirdNumber + ", ");
        System.out.println("and " + fourthNumber + ".");
    }
}
