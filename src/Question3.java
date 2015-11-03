
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);
        
        //Tell users to input numbers
        System.out.println("Please type 4 different numbers on 4 seperate lines");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();
        
        //Tell users their numbers
        System.out.println("Your numbers were " + firstNumber + "," + secondNumber + "," + thirdNumber + "," + fourthNumber);
        
        
        
    }
}
