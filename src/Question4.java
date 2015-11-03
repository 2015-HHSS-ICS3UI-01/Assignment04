
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create the scanner
        Scanner numberInput = new Scanner(System.in);
        //ask user costs
        System.out.println("How much does the food for prom cost?");
        double food = numberInput.nextDouble();
        
        System.out.println("How much does the DJ cost?");
        double dj = numberInput.nextDouble();
        
        System.out.println("How much does it cost to rent the hall?");
        double hallRent = numberInput.nextDouble();
        
        System.out.println("How much does decorations cost?");
        double decor = numberInput.nextDouble();
        
        System.out.println("How much does it cost for staff?");
        double staff = numberInput.nextDouble();
        
        System.out.println("How much for miscellaneous costs?");
        double misc = numberInput.nextDouble();
        //cost of ticket to be entered in formula
        double ticketCost = 35;
        //add all costs
        double total = (food + dj + hallRent + decor + staff + misc);
        //find number of tickets needed
        double breakEven = Math.ceil(total / ticketCost);
        //tell user number of tickets
        System.out.println("You need to sell: " + breakEven + " tickets to break even.");
        
    }
}
