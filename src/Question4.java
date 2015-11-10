
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How much does the food for the prom cost?");
        double Food = input.nextDouble();
        System.out.println("How much does the DJ cost?");
        double DJ = input.nextDouble();
        System.out.println("How much does it cost to rent the hall?");
        double rent = input.nextDouble();
        System.out.println("How much does decorations cost?");
        double decor = input.nextDouble();
        System.out.println("How much does it cost for staff?");
        double wages = input.nextDouble();
        System.out.println("How much for miscellaneous costs?");
        double miscellaneous = input.nextDouble();
        //total up costs
        double total = (Food + DJ + rent + decor + wages + miscellaneous);
        double breakEven = Math.ceil(total/35);
        System.out.println("The total cost is $" + total);
        System.out.println("You must sell " + breakEven + " tickets to break even.");
        
    }
}
