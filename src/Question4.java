
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an input scanner
        Scanner input = new Scanner (System.in);
        //ask how much food costs
        System.out.println("Tickets cost $35.");
        System.out.println("The program will ask various expenses in dollar amounts.");
        System.out.println("Enter all answers below the question.");
        System.out.println("How much does food cost (in dollars)?");
        
        
        
        double foodCost = input.nextDouble();
        
        System.out.println("How much does the DJ cost?");
        
        double djCost = input.nextDouble();
        
        System.out.println("How much does it cost to rent the hall?");
        
        double hallCost = input.nextDouble();
        
        System.out.println("How much do decorations cost?");
        
        double decorationsCost = input.nextDouble();
        
        System.out.println("How much do staff cost?");
        
        double staffCost = input.nextDouble();
        
        System.out.println("How much do miscellaneous expenses add to?");
        
        double misc = input.nextDouble();
        
        System.out.println("Now I'll calculate how many tickets you need to sell to break even...");
        
        double totalCost = foodCost+djCost+hallCost+decorationsCost+staffCost+misc;
        double breakEven = totalCost/35;
        
        System.out.println("Total cost is " + totalCost);
        System.out.println("You will need to sell " + breakEven + "tickets to break even.");
    }
    
}
