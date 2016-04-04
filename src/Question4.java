
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("How much does the food for prom cost?:");
        Scanner input = new Scanner(System.in);
        int food = input.nextInt();
        System.out.println("How much does the DJ cost?:");
        int dj = input.nextInt();
        System.out.println("How much does it cost to rent the hall? :");
        int rent = input.nextInt();
        System.out.println("How much does decorations cost? :");
        int decorations = input.nextInt();
        System.out.println("How much does it cost for staff? :");
        int staff = input.nextInt();
        System.out.println("How much for miscellaneous costs? :");
        int misc = input.nextInt();
        int total = misc + staff + decorations + rent + dj + food;
        double tickets = total / 35;
        System.out.println("The total cost will be $" + total + " so you must sell " + tickets + " tickets to break even");
    }
}
