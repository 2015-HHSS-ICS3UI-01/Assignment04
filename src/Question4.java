
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
        int prom;
        int dj;
        int rent;
        int decoration;
        int staff;
        int miscellaneous;
        
     // Bunch of questions asked, and costs being stored
        System.out.println("How much does the food for prom cost?");
        prom = input.nextInt();
        
        System.out.println("How much does the DJ cost?");
        dj = input.nextInt();
        
        System.out.println("How much does it cost to rent the hall?");
        rent = input.nextInt();
        
        System.out.println("How much does decorations cost?");
        decoration = input.nextInt();
        
        System.out.println("How much does it cost for staff?");
        staff = input.nextInt();
        
        System.out.println("How much for miscellaneous costs?");
        miscellaneous = input.nextInt();
        
        // Adding all numbers together and making it into one int
        int total = (prom + dj + rent + decoration + staff + miscellaneous);
        
        System.out.println("The total cost is $" + total + ". You will need to sell " + (total/35) + " tickets to break even.");
        
        input.close();
        
    }
}
