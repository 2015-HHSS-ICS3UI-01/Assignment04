
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        int myInt;

        //convert inches to cm
        System.out.println("Please enter the measurement in inches you wish to convert:");
        double inches = input.nextInt();

        System.out.println(inches * 2.54);
    }
}
