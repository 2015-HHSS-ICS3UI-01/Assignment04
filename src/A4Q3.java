
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Make the scanner
        Scanner input = new Scanner (System.in);
        
        //Ask the user for 4 numbers
        System.out.println("Please enter 4 numbers");
        String number1 = input.nextLine();
        String number2 = input.nextLine();
        String number3 = input.nextLine();
        String number4 = input.nextLine();
        
        //Tell the user what the numbers were with commas seperating them
        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + ", and " + number4 + " ");
        
    }
}
