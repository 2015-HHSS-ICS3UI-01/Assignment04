
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class Question02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //make scanner
        Scanner input = new Scanner(System.in);

        //ask user for number to convert to centimetres
        System.out.println("To convert centimetres to inches, ");
        System.out.println("Enter the number you wish to convert:");
        int usersNumber = input.nextInt();

        //2.54 centimetres is 1 inch
        double inchesConvertion = 2.54;

        //users number gets multiplies by 2.54
        double cmConvertion = inchesConvertion * usersNumber;

        //shows user their number converted to centimetres
        System.out.println("Your Convertion for " + usersNumber + " inches to centimetres is: " + cmConvertion);
    }
}
