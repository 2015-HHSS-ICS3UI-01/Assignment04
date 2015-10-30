
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("How much does the food for prom cost?: ");
        int foodForProm = input.nextInt();
        
        System.out.print("How much does the DJ cost?: ");
        int DJ = input.nextInt();
        
        System.out.print("How much does it cost to rent the hall?: ");
        int rent = input.nextInt();
        
        System.out.print("How much does decorations cost?: ");
        int decorations = input.nextInt();
        
        System.out.print("How much does it cost for staff?: ");
        int staff = input.nextInt();
        
        System.out.print("How much is miscellaneous cost?: ");
        int mis = input.nextInt();
        
         int total = foodForProm + DJ + rent + decorations + staff + mis;
         
        System.out.println("It will cost you a total of " + total);
        
        
        
    }
}
