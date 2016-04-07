
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How much does the food for prom cost?");
        int food = input.nextInt();
        System.out.println("How much does the DJ cost?");
        int DJ = input.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        int hall = input.nextInt();
        System.out.println("How much does decorations cost?");
        int dec = input.nextInt();
        System.out.println("How much does it cost for staff?");
        int staff = input.nextInt();
        System.out.println("How much for miscellaneous costs?");
        int mis = input.nextInt();
        
        double total = food + DJ + hall + dec + staff + mis;
        double breakeven = Math.ceil(total/35);
        System.out.print("The total cost is $" + total + "." );
        System.out.print(" You will need to sell " + breakeven + " tickets to break even.");
    }
}
