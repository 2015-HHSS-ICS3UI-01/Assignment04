
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner (System.in);
        
        
        //Ask how much food costs
        System.out.println("How much does the food for prom cost?");
        double Food = input.nextDouble();
        
        //Ask how much DJ cost
        System.out.println("How much does the DJ cost?");
        double DJ = input.nextDouble();
        
        //Ask how much rent costs
        System.out.println("How much does it cost to rent the hall?");
        double Rent = input.nextDouble();
        
        //Ask how much decorations cost
        System.out.println("How much does decorations cost?");
        double Decorations = input.nextDouble();
        
        //Ask how much staff costs
        System.out.println("How much does it cost for staff?");
        double Staff = input.nextDouble();
        
        //Ask how much micellaneous items cost
        System.out.println("How much for miscellaneous costs?");
        double Miscellaneous = input.nextDouble();
        
        
        //add up all the costs
        double totalCost = Food + DJ + Decorations + Staff + Miscellaneous;
        
        //Tell them the total cost
        System.out.println("Your total cost is " + totalCost);
               
        double ticketsNeeded = Math.ceil(totalCost/35);
        
        //find how many tickets are to be sold to break even
        System.out.println("You need to sell " + ticketsNeeded + " tickets break even");
        
    }
}
