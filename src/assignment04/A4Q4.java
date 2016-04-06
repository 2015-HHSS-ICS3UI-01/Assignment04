/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author dhila4674
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How much does the food for prom cost?");
        int A = input.nextInt();
        System.out.println("How much does the DJ cost?");
        int B = input.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        int C = input.nextInt();
        System.out.println("How much does decorations cost?");
        int D = input.nextInt();
        System.out.println("How much does it cost for staff?");
        int E = input.nextInt();
        System.out.println("How much for miscellaneous costs?");
        int F = input.nextInt();
        
        System.out.println("The total cost is " + (A + B + C + D + E + F));
        System.out.println("You need to sell " + (A + B + C + D + E + F)/35 + " tickets to break even.");
    }
}
