/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author maxia2242
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Andrew = new Scanner(System.in);
         int food;
         int DJ;
         int hall;
         int dn;
         int staff;
         int mis;
         int total;
         int tickets;
         
         System.out.println("How much does the food for prom cost? :");
         food = Andrew.nextInt();
         System.out.println("How much does the DJ cost? :");
         DJ = Andrew.nextInt();
         System.out.println("How much does it cost to rent the hall? :");
         hall = Andrew.nextInt();
         System.out.println("How much does decorations cost? :");
         dn =Andrew.nextInt();
         System.out.println("How much does it cost for staff? :");
         staff = Andrew.nextInt();
         System.out.println("How much for miscellaneous costs? :");
         mis = Andrew.nextInt();
         total = food + DJ + hall + dn + staff + mis;
         tickets = total/35 +1;
         System.out.println("The total cost is " + total+ ". " + "You will need to sell " + tickets + " tickets to break even.");
    }
}
