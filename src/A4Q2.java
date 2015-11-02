
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make a new Scanner
        Scanner input = new Scanner(System.in);

        //String = myString

        System.out.println("Please enter a number you wish to convert fron centimeters to inches");

        //convert random number to centimeters
        double inches = input.nextDouble();

        double inchestoCm = inches * 2.54;


        //Tell them their answer
        System.out.println("is " + inchestoCm + " centimeters");

    }
}
