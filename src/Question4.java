
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // new scanner
        Scanner input = new Scanner(System.in);
        
        
     // Bunch of questions asked, and costs being stored
        System.out.println("How much does the food for prom cost?");
        double prom = input.nextDouble();
        
        System.out.println("How much does the DJ cost?");
        double dj = input.nextDouble();
        
        System.out.println("How much does it cost to rent the hall?");
        double rent = input.nextDouble();
        
        System.out.println("How much does decorations cost?");
        double decoration = input.nextDouble();
        
        System.out.println("How much does it cost for staff?");
        double staff = input.nextDouble();
        
        System.out.println("How much for miscellaneous costs?");
        double miscellaneous = input.nextDouble();
        
        // Adding all numbers together to give result
        double total = (prom + dj + rent + decoration + staff + miscellaneous);
       
        System.out.println("The total cost is $" + total + ". You will need to sell " + Math.ceil(total/35) + " tickets to break even.");
        
        input.close();
        
    }
}
