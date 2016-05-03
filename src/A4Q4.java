
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello! I will calculate your costs!");
        System.out.println("Please enter the amount for the food.");
        double f = input.nextDouble();
        System.out.println("Please enter the cost of the DJ.");
        double d = input.nextDouble();
        System.out.println("Please enter the hall rental price.");
        double h = input.nextDouble();
        System.out.println("Please enter the amount paid to staff.");
        double s = input.nextDouble();
        System.out.println("Any miscellaneous costs?");
        double m = input.nextDouble();
        double total = f + d + h + s + m;
        double breakEven = total / 35;
        System.out.println("Your total is " + total + ".");
        System.out.println("Your break even point is " + breakEven + " tickets.");
        System.out.println("Have a good time at prom!");
    }
}
