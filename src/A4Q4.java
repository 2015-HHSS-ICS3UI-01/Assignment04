
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String name;
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("How much does the food for prom cost?");
         int food = input.nextInt();
         System.out.println("How much does the DJ cost?");
         int dj = input.nextInt();
         System.out.println("How much does it cost to rent the hall?");
         int hall = input.nextInt();
         System.out.println("How much does decorations cost?");
         int decor = input.nextInt();
         System.out.println("How much does it cost for staff?");
         int staff = input.nextInt();
         System.out.println("How much for miscellaneous costs?");
         int misc = input.nextInt();
         
         System.out.println("The total cost is " + (food + dj + hall + decor + staff + misc));
         
         System.out.println("You will need to sell " + (food + dj + hall + decor + staff + misc)/35 + " tickets.");
    }
}
