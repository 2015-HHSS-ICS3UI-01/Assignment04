
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How much does the food for prom cost?");
        double food = input.nextDouble();

        System.out.println("How much does the DJ cost?");
        double dj = input.nextDouble();

        System.out.println("How much does it cost to rent the hall?");
        double hall = input.nextDouble();

        System.out.println("How much does decorations cost?");
        double deco = input.nextDouble();

        System.out.println("How much does it cost for staff?");
        double staff = input.nextDouble();

        System.out.println("How much for miscellaneous costs?");
        double misc = input.nextDouble();

        double cost = food + dj + hall + deco + staff + misc;
        double ticketFirst = cost / 35;
        int ticket = (int) Math.ceil(ticketFirst);

        System.out.println("The total cost is $" + cost + ". You will need to sell " + ticket + " tickets to break even.");

        input.close();
    }
}
