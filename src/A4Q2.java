
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an amount in inches to be converted to centimetres.");
        double inch = input.nextDouble();
        double centimetres = 2.54 * inch;
        System.out.println(inch + " inches" + " will be " + centimetres + " cm.");
        System.out.println("Thanks for your time!");
        
    }
}
