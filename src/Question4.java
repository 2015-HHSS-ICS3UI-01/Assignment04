
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
        System.out.print("How much does the food for prom cost? : ");
        int food = input.nextInt();
        System.out.print("How much does the DJ cost? : ");
        int DJ = input.nextInt();
        System.out.print("How much does it cost to rent the hall? : ");
        int hall = input.nextInt();
        System.out.print("How much do decorations cost? : ");
        int decor = input.nextInt();
        System.out.print("How much does it cost for staff? : ");
        int staff = input.nextInt();
        System.out.print("How much for miscellaneous costs? : ");
        int misc = input.nextInt();

        //Add up expenses
        int total = food + DJ + hall + decor + staff + misc;
        System.out.println("The total cost is " + total);

        //Calculate breakeven point
        int ticket = 35;
        int breakeven = total / ticket;
        System.out.println("You will need to sell " + breakeven + " tickets to break even.");
    }
}
