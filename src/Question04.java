
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class Question04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("How much does the food for prom cost?: ");
        double foodCost = input.nextDouble();
        
        System.out.print("How much does the DJ cost?: ");
        double djCost = input.nextDouble();
        
        System.out.print("How much does it cost to rent the hall?: ");
        double hallCost = input.nextDouble();
        
        System.out.print("How much does decorations cost?: ");
        double decorationCost = input.nextDouble();
        
        System.out.print("How much does it cost for staff?: ");
        double staffCost = input.nextDouble();
        
        System.out.print("How much for miscellaneous costs?: ");
        double otherCosts = input.nextDouble();
        
        double totalCost = foodCost + djCost + hallCost + decorationCost + staffCost + otherCosts;
        int ticketCost = 35;
        double totalTickets = totalCost / ticketCost;
        
        System.out.println("The total cost is $" + totalCost + " and you would need to sell " + totalTickets);

    }
}
