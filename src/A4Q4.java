
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("How much does the food for prom cost?");
        int foodcost = in.nextInt();
        System.out.println("How much does the DJ cost?");
        int djcost = in.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        int rentcost = in.nextInt();
        System.out.println("How much does decorations cost?");
        int deccost = in.nextInt();
        System.out.println("How much does it cost for staff?");
        int staffcost = in.nextInt();
        System.out.println("How much for miscellaneous costs?");
        int miscost = in.nextInt();
        
        int tcost = foodcost + djcost + rentcost + deccost + staffcost + miscost;
        double breakeven = Math.ceil(tcost/35.0);
        
        System.out.println("The total cost is $" + tcost + ". You will need to sell " + breakeven + " tickets to break even.");
        
    }
}
