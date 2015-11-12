
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        // how much does food cost
        System.out.println(" How much does the food for prom cost? ");
        double prom = input.nextDouble();
        //how much does the dj cost
        System.out.println(" How much does the DJ cost? ");
        double dj = input.nextDouble();
        //how much does the hall cost
        System.out.println(" How much does it cost to rent the hall? ");
        double hall = input.nextDouble();
        //how much does the decorations cost
        System.out.println(" How much does decorations cost? ");
        double decorations = input.nextDouble();
        //how much does the staff cost
        System.out.println(" How much does it cost for staff? ");
        double staff = input.nextDouble();
        //how much for miscellaneous items
        System.out.println(" How much for miscellaneous costs? ");
        double miscellaneous = input.nextDouble();
        
        //costs
        double totalCost = prom + dj + hall + decorations + staff + miscellaneous;
        
        double ticketNeeded = Math.ceil(totalCost/35);
        //find how many tickets are sold
        System.out.println(" The total cost is "+ "$" + totalCost + ". You will need to sell " + ticketNeeded + " tickets to break even.");


         
        
    }
}
