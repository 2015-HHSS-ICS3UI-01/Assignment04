
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
        
        // ask the cost of the food and collect the information
        System.out.print("How much does the food for prom cost? : ");
        double foodCost = input.nextDouble();
        
        // ask the cost of the DJ and collect the information
        System.out.print("How much does the DJ cost? : ");
        double djCost = input.nextDouble();
        
        // ask the cost of the hall and collect the information
        System.out.print("How much does it cost to rent the hall? : ");
        double hallCost = input.nextDouble();
        
        // ask the cost of the decorations and collect the information
        System.out.print("How much does decorations cost? : ");
        double decorationsCost = input.nextDouble();
        
        // ask the cost of the staff and collect the information
        System.out.print("How much does it cost for staff? : ");
        double staffCost = input.nextDouble();
        
        // ask the cost of miscellaneous costs and collect the information
        System.out.print("How much for miscellaneous costs ? : ");
        double miscellaneousCost = input.nextDouble();
        
        // find the total cost of all the catagories of prom
        double totalCost = foodCost + djCost + hallCost + decorationsCost + staffCost + miscellaneousCost;
        totalCost = Math.round(totalCost * 100) / 100;
        // find the number of tickets needed to sell at a cost of $35 to break even
        double totalTickets = Math.ceil(totalCost / 35.0);
        // display the total cost and the number od tickets neede to sell to break even
        System.out.println("The total cost is $" + totalCost + "." + " You would need to sell " + totalTickets + " tickets to break even.");
        
        // close input scanner
        input.close();
        
    }
}
