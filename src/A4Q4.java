
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///create scanner
        Scanner in = new Scanner(System.in);
        
        //create integers for each fund
        System.out.println("How much does the food cost?");
        double food = in.nextDouble();
        
        System.out.println("How much does the DJ cost?");
        double dj = in.nextDouble();
        
        System.out.println("How much does it cost to rent the hall?");
        double hall = in.nextDouble();
        
        System.out.println("How much do decorations cost?");
        double decor = in.nextDouble();
        
        System.out.println("How much does it cost for staff?");    
        double staff = in.nextDouble();
        
        System.out.println("How much for miscellaneous costs?");
        double misc = in.nextDouble();
        
        double total = (food + dj+ hall + decor + staff + misc);
        //calculate total cost
        System.out.println("The total cost for the prom is " + total + " dollars.");
        //calculate number of tickits that must be sold
        System.out.println("You must sell " + Math.ceil(total/35) + " tickets to break even.");
    }
}
