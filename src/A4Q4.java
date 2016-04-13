
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Ask user prices concerning food
        System.out.println("How much does the food for prom cost?");
        double food = input.nextDouble();
        // Ask user prices concerning the DJ
        System.out.println("How much does the DJ cost?");
        double dj = input.nextDouble();
        // Ask user prices concerning the hall
        System.out.println("How much does it cost to rent the hall?");
        double hall = input.nextDouble();
        // Ask user prices concerning the decorations
        System.out.println("How much does decorations cost?");
        double decoration = input.nextDouble();
        // Ask user prices concerning the staff
        System.out.println("How much does it cost for staff?");
        double staff = input.nextDouble();
        // Ask user prices concerning other prices (miscellaneous costs)
        System.out.println("How much for miscellaneous cost?");
        double other = input.nextDouble();

        double cost = (double) ((food + dj + hall + decoration + staff + other));
        double ticket = (double) ((food + dj + hall + decoration + staff + other) / 35);
        System.out.println("Your total cost is $" + Math.ceil(cost) + ". You will need to sell " + Math.ceil(ticket) + " tickets to break even.");
    }
}
