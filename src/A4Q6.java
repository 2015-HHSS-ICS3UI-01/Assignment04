
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Number of daytime minutes?");
        double DYTM = input.nextDouble();
        System.out.println("Number of evening minutes?");
        double VNNG = input.nextDouble();
        System.out.println("Number of weekend minutes?");
        double WKND = input.nextDouble();
        double ErmA = (DYTM - 100);
        if (ErmA < 0) {
            ErmA = 0;
            }
        double ErmB = (DYTM - 250);
        if (ErmB < 0) {
            ErmB = 0;
            }
        double ATotal = ((ErmA) * 0.25) + (VNNG * 0.15) + (WKND * 0.20);
        double BTotal = ((ErmB) * 0.45) + (VNNG * 0.35) + (WKND * 0.25);
        System.out.println("Plan A costs " + ATotal);
        System.out.println("Plan B costs " + BTotal);
        if (ATotal == BTotal) {
            System.out.println("Both plans are the same price.");
        }
        if (ATotal < BTotal) {
            System.out.println("Plan A is the cheapest.");
        }
        if (ATotal > BTotal) {
            System.out.println("Plan B is the cheapest.");
        }
    }
}
