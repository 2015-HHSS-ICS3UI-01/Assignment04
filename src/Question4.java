
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program to collect the different catagories of the prom cost
        // then find the total cost and the number of tickets that are needed
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the cost of the food
        System.out.println("How much does the food for prom cost?");
        // collect the cost of the food
        double foodCost = input.nextDouble();
        
        // ask the cost of the DJ
        System.out.println("How much does the DJ cost?");
        // collect the cost of the DJ
        double djCost = input.nextDouble();
        
        // ask the cost of the hall
        System.out.println("How much does it cost to rent the hall?");
        // collect the cost of the hall
        double hallCost = input.nextDouble();
        
        // ask the cost of the decorations
        System.out.println("How much does decorations cost");
        // collect the cost of the decorations
        double decorationsCost = input.nextDouble();
        
        // ask the cost of the staff
        System.out.println("How much does it cost for staff?");
        // collec the cost of the staff
        double staffCost = input.nextDouble();
        
        // blank line
        System.out.println("");
        
        // find the total cost of all the catagories of prom
        double totalCost = foodCost + djCost + hallCost + decorationsCost + staffCost;
        
        // find the number of tickets needed to sell at a cost of $35 to break even
        double totalTickets = totalCost / 35;
        // display the total cost and the number od tickets neede to sell to break even
        System.out.println("The total cost is " + totalCost + "." 
                            + "You would need to sell " + totalTickets + "to break even.");
        
        
    }
}
