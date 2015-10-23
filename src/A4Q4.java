
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //import Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("How much does the food for prom cost? :");
        double food = input.nextInt();

        System.out.println("How much does the DJ cost? :");
        double dj = input.nextInt();

        System.out.println("How much does it cost to rent the hall? :");
        double hall = input.nextInt();

        System.out.println("How much does decorations cost? :");
        double decorations = input.nextInt();

        System.out.println("How much does it cost for staff? :");
        double staff = input.nextInt();

        System.out.println("How much for miscellaneous costs? :");
        double miscellaneous = input.nextInt();

        double total = +food + dj + hall + decorations + staff + miscellaneous;
        System.out.println("The total cost is $" + total + ". You will need to sell " + total / 35 + " tickets to break even.");


    }
}
