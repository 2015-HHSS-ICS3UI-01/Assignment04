
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create new scannner
        Scanner input = new Scanner(System.in);

        System.out.println("How much does the food for prom cost?");

        double food = input.nextDouble();

        //ask user how much the dj cost
        System.out.println("How much does the DJ cost? ");

        //user enters dj price
        double dj = input.nextDouble();

        //ask user hall price
        System.out.println("How much does it cost to rent the hall?");

        //user enters hall price
        double hall = input.nextDouble();
        //ask user for decoration price
        System.out.println("How much does decorations cost? ");
        //user enters decoration price
        double decoration = input.nextDouble();
        //ask user for
        System.out.println("How much does it cost for staff? ");

        double staff = input.nextDouble();

        System.out.println("How much for miscellaneous costs");

        double miscellaneous = input.nextDouble();

        double total = dj + hall + decoration + staff + miscellaneous;

        double amount = total / 35;
        amount = Math.ceil(amount);
        System.out.println("The total cost is " + total + " you will need to sell " + amount + "  tickets to break even");
    }
}
