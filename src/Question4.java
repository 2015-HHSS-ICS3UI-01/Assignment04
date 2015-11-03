
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);
        
        //Get the prom expenses
        System.out.println("How much does food for prom cost?");
        double foodCost = input.nextDouble();
        System.out.println("How much does the DJ cost?");
        double djCost = input.nextDouble();
        System.out.println("How much does it cost to rent the hall?");
        double hallCost = input.nextDouble();
        System.out.println("How much do decorations cost?");
        double decorationCost = input.nextDouble();
        System.out.println("How much does it cost for staff?");
        double staffCost = input.nextDouble();
        System.out.println("How much for miscellaneous costs?");
        double miscellaneousCost = input.nextDouble();
        System.out.println("How much do tickets cost?");
        double ticketCost = input.nextDouble();
        
        //Create variables to caculate the total
        double total = foodCost + djCost + hallCost + staffCost + decorationCost + miscellaneousCost;
        double numberOfTicketsNeededToBreakEven = total / 35;
        
        //Tell the user the total
        System.out.println("The total cost is $" + total + ". You will need to sell " + numberOfTicketsNeededToBreakEven + " tickets to break even.");
        
        
    }
}
