
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new scanner 

        Scanner input = new Scanner(System.in);

        // Ask user to input Their 4 numbers 
        System.out.println("Please enter 4 numbers on seperate lines");


        // ask user for first number 
        String number1 = input.next();

        // ask user for second number 
        String number2 = input.next();

        //ask user for third number 
        String number3 = input.next();

        //ask user for 4th number 
        String number4 = input.next();

        //tell the user what their numbers were 
        System.out.println("Your numbers are " + number1 + ", " + number2 + ", " + number3 + ", " + number4);

    }
}
