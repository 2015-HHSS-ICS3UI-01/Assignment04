
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Costs for prom (food,music,renting place,decorations,staff,misc. costs)
        System.out.println("Enter food expenses");
        int food = input.nextInt();
        System.out.println("Enter DJ expenses");
        int dj = input.nextInt();
        System.out.println("Enter renting expenses");
        int rent = input.nextInt();
        System.out.println("Enter cost of decorations");
        int deco = input.nextInt();
        System.out.println("Enter staff expenses");
        int staff = input.nextInt();
        System.out.println("Enter misc. expenses");
        int misc = input.nextInt();
        
        //calculating expenses + how many tickets need to be sold
        int total = food+dj+rent+deco+staff+misc;
        int ticket = total/35;
        
        //tell user cost of prom and how many tickets need to be sold
        System.out.println("The total cost is $" +total+ ". You will need " +ticket+ " tickets sold to break even.");
        
    }
}
