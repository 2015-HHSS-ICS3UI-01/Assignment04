
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("I will calculate your total for prom");
        System.out.println("How much will food cost?");
        int food = input.nextInt();
        System.out.println("How much does the DJ cost?");
        int dj = input.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        int hall = input.nextInt();
        System.out.println("How much do the decorations cost?");
        int dec = input.nextInt();
        System.out.println("How much do the staff cost?");
        int staff = input.nextInt();
        System.out.println("How much for miscellaneous costs?");
        int mis = input.nextInt();
        
        int total = food + dj + hall + dec + staff + mis;
        
        int brk = total /35;
        
        System.out.println("your total is " + total + " dollars and you break even if you sell " + brk + " tickets");
    }
}
