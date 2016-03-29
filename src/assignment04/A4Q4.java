/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int foodcost;
                int DJcost;
                int hallrental;
                int decorcost;
                int staffcost;
                int misccost;
                int totalcost;
                int ticketcost;
                int totaltickets;
                Scanner input = new Scanner(System.in);
                ticketcost=35;
                System.out.print("How much does the food for prom cost? ");
                foodcost = input.nextInt();
                System.out.print("How much does the DJ cost? ");
                DJcost = input.nextInt();
                System.out.print("How much does it cost to rent the hall? ");
                hallrental = input.nextInt();
                System.out.print("How much does decorations cost? ");
                decorcost = input.nextInt();
                System.out.print("How much does it cost for staff? ");
                staffcost = input.nextInt();
                System.out.print("How much for miscellaneous costs? ");
                misccost = input.nextInt();
                totalcost=foodcost+DJcost+hallrental+decorcost+staffcost+misccost;
                totaltickets=totalcost/ticketcost;
                System.out.println("The total cost is $"+totalcost+ ". You will need to sell "+totaltickets+ " tickets to break even.");
                
    }
}
