
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Ask user for input
        //Get cost of food and create food integer
        System.out.print("How much does the food for prom cost? : ");
        int food = input.nextInt();
        //Get cost of DJ and create DJ integer
        System.out.print("How much does the DJ cost? : ");
        int DJ = input.nextInt();
        //Get cost of hall and create hall integer
        System.out.print("How much does it cost to rent the hall? : ");
        int hall = input.nextInt();
        //Get cost of decor and create decor integer
        System.out.print("How much do decorations cost? : ");
        int decor = input.nextInt();
        //Get cost of staff and create staff integer
        System.out.print("How much does it cost for staff? : ");
        int staff = input.nextInt();
        //Get cost of misc and create misc integer
        System.out.print("How much for miscellaneous costs? : ");
        int misc = input.nextInt();

        //Add up expenses
        int total = food + DJ + hall + decor + staff + misc;
        System.out.println("The total cost is " + total);

        //Calculate breakeven point
        double ticket = 35;
        //Round breakeven number up
        double breakeven = Math.ceil(total / ticket);
        //Display breakeven point to user
        System.out.println("You will need to sell " + breakeven + " tickets to break even.");
    }
}
