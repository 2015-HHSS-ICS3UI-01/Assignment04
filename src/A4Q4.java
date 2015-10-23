
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make scanner
        Scanner input = new Scanner (System.in);
        
        //ask user questions and assign variables to each input
        System.out.println("How much does the food for prom cost?");
        int food = input.nextInt();
        
        System.out.println("How much does the DJ cost?");
        int dj = input.nextInt();
        
        System.out.println("How much does it cost to rent the hall?");
        int hall = input.nextInt();
                
        System.out.println("How much do the decorations cost?");
        int dec = input.nextInt();
        
        System.out.println("How much does it cost to pay the staff?");
        int staff = input.nextInt();
        
        System.out.println("How much for miscellaneous costs?");
        int misc = input.nextInt();
        
        //ticket variable cost
        int ticket = 35;
        
        //determine the total cost
        int total = food + dj + hall + dec + staff + misc;
        
        //determine the amount of tickets needed to break even
        int tt = total/ticket;
        
        //tell user the total cost and tickets needed
        System.out.print("The total cost is " + total + ".");
        System.out.println(" You need to sell " + tt + " tickets to break even.");
        
        //close scanner
        input.close();
    }
}
