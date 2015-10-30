
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter 4 numbers on seperate lines");
        
        int firstNumber = input.nextInt();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        double forthNumber = input.nextDouble();
        
        System.out.print("You entered numbers");
        System.out.print( firstNumber + " ,");
        System.out.print( secondNumber + " ,");
        System.out.print( thirdNumber + " ,");
        System.out.print( forthNumber);
    }
}
