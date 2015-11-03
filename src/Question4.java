
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Cost of 1 ticket
        double ticketCost = 35;
        System.out.println("How much does the food for prom cost?");
        //Input the price for the prom food
        int cost1 = input.nextInt();
        System.out.println("How much does the DJ cost?");
        //Input the price for the DJ
        int cost2 = input.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        //Input the price for renting the hall
        int cost3 = input.nextInt();
        System.out.println("How much does decorations cost?");
        //Input the price for the decorations
        int cost4 = input.nextInt();
        System.out.println("How much does it cost for staff?");
        //Input the price for the staff
        int cost5 = input.nextInt();
        System.out.println("How much for miscellaneous costs?");
        //Input the price for anything miscellaneous
        int cost6 = input.nextInt();
        double totalCost = cost1 + cost2 + cost3 + cost4 + cost5 + cost6;
        int totalTickets = 0;
        while (totalCost > ticketCost*totalTickets)
        {
            totalTickets = totalTickets + 1;
        }
        //displays the total cost and the number of tickets needed to break even
        System.out.println("The total cost is $" + totalCost + ". You will need to sell " + totalTickets + " tickets to break even.");
    }
}
