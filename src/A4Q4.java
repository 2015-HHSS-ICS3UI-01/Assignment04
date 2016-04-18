/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("How much does the food cost for prom?");
        double Prom = input.nextDouble();

        System.out.println("How much does the DJ cost?");
        double DJ = input.nextDouble();

        System.out.println("How much does it cost to rent the hall?");
        double Hall = input.nextDouble();

        System.out.println("How much does decoration cost?");
        double Decor = input.nextDouble();

        System.out.println("How much does it cost for staff?");
        double Staff = input.nextDouble();

        System.out.println("How much does miscellaneous cost?");
        double Mis = input.nextDouble();

        double total = Prom + DJ + Hall + Decor + Staff + Mis;
        
        double tickets = Math.ceil(total / 35);

        System.out.println("The total cost will be" + total + "and you will need" + tickets + "to break even");
    }
}
