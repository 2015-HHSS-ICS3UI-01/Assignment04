
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bettk6516
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //imports scanner
        Scanner input = new Scanner(System.in);

        System.out.println("cost!");
        //takes cost for food
        System.out.println("How much does the food for prom cost?");
        int food = input.nextInt();
        //takes cost for the DJ
        System.out.println("How much does the DJ cost?");
        int dJ = input.nextInt();
        //takes cost for hall
        System.out.println("How much does it cost to rent the hall?");
        int hall = input.nextInt();
        //takes cost for decorations
        System.out.println("how much do decorations cost?");
        int dec = input.nextInt();
        //takes cost for staff
        System.out.println("How much does it cost for staff?");
        int staff = input.nextInt();
        //takes cost for misc stiff
        System.out.println("how much does miscellaneous stuff cost?");
        int misc = input.nextInt();

        //adds up total cost
        int cost = food + dJ + hall + dec + staff + misc;
        
      //adds up the cost for tickets and how many tickets sold to break even
        int tickets = 35;
        int ticketAmount = 0;
        while (tickets < cost) {
            tickets = tickets + 35;
            ticketAmount = ticketAmount + 1;
        }

        System.out.println("The total cost is " + cost + " you will need to sell " + ticketAmount + " tickets to break even");
        //sends out toal cost and amount of tickets soled to break even



    }
}
