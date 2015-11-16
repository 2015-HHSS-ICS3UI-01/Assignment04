
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner 
        Scanner in = new Scanner(System.in);

        //Ask for number of minutes
        System.out.println("Number of daytime minutes?");
        double day = in.nextDouble();

        System.out.println("Number of evening minutes?");
        double night = in.nextDouble();

        System.out.println("Number of weekend minutes?");
        double weekend = in.nextDouble();

        //make double for plan A
        double PlanA;
        if (day < 100) {
            PlanA = (night * 0.15) + (weekend * 0.2);
        } else {
            PlanA = ((day) * 0.25 - 25) + (night * 0.15) + (weekend * 0.2);
        }
        
        double PlanB;
        if (day < 250) {
            PlanB = (night * 0.35) + (weekend * 0.25);
        } else {

            PlanB = ((day) * 0.45 - 112.5) + (night * 0.35) + (weekend * 0.25);
        }

        PlanA = Math.round(PlanA * 100) / 100.0;
        PlanB = Math.round(PlanB * 100) / 100.0;

        //print out which one is cheaper
        System.out.println("Plan A costs $" + PlanA);

        System.out.println("Plan B costs $" + PlanB);

        if (PlanA == PlanB) {
            System.out.println("Plan A and Plan B are the same price");

        } else {
            if (PlanA < PlanB) {
                System.out.println("Plan B is the cheapest");
            } else {
                System.out.println("Plan A is the cheapest");
            }
        }
    }
}

