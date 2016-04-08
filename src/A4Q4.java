
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String name;
        String costs;

        Scanner input = new Scanner(System.in);

        System.out.println("Please print your name.");
        name = input.nextLine();

        System.out.println("Hello " + name + ", please enter the cost of the food for the prom.");
        double a = input.nextDouble();

        System.out.println("Please enter the cost of the DJ.");
        double b = input.nextDouble();

        System.out.println("How much is it going to cost to rent the hall?");
        double c = input.nextDouble();

        System.out.println("What is the cost of decorations?");
        double d = input.nextDouble();

        System.out.println("How much will it cost to pay the staff?");
        double e = input.nextDouble();

        System.out.println("What are the miscellaneous expenses going to cost?");
        double f = input.nextDouble();

        double total = a + b + c + d + e + f;

        double tickets = total / 35;

        System.out.println("The total cost for the prom will be $" + total + " you will need to sell a total of " + tickets + " to break even.");

    }
}
