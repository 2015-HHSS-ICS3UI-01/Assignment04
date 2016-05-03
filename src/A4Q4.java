
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
                System.out.println("How much does the food for prom cost?.");
                double A = input.nextDouble();   
                System.out.println("How much does the DJ cost?");
                double B = input.nextDouble(); 
                System.out.println("How much does it cost to rent the hall?");
                double C = input.nextDouble(); 
                System.out.println("How much does decorations cost?");
                double D = input.nextDouble(); 
                System.out.println("How much does it cost for staff?");
                double E = input.nextDouble(); 
                System.out.println("How much for miscellaneous costs?");
                double F = input.nextDouble(); 
                System.out.println("The total cost will be " + (A + B + C + D + E + F));
                System.out.println("You will need to sell " + ((A + B + C+ D + E + F)/35.0) + " tickets to break even.");
    }
}
