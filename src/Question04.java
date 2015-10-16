
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
        
        //make new scanner
        Scanner input = new Scanner(System.in);

        //ask users different prices
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
        
        //total cost
        double totalCost = foodCost + djCost + hallCost + decorationCost + staffCost + otherCosts;
        //price of tickets
        int ticketCost = 35;
        //number of tickets needed
        double totalTickets = totalCost / ticketCost;
       
        //tells user the total amount of money and hpw many tickets they need to sell
        System.out.println();
        System.out.println("The total cost is $" + totalCost + ". You would need to sell about " + totalTickets + "tickets.");
    }
}
