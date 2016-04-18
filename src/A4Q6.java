/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Number of daytime minutes?");
        double daytime = input.nextDouble();

        System.out.println("Number of evening minutes?");
        double evening = input.nextDouble();

        System.out.println("Number of weekend minutes?");
        double weekend = input.nextDouble();

        double daytimeMin = (daytime - 100) * 0.25;

        double eveningMin = (evening * 0.15);

        double weekendMin = (weekend * 0.20);

        double PlanA = (daytimeMin + eveningMin + weekendMin);

        double daytimeMin2 = (daytime - 250) * 0.45;

        double eveningMin2 = (evening * 0.35);

        double weekendMin2 = (weekend * 0.25);

        double PlanB = (daytimeMin2 + eveningMin2 + weekendMin2);

        System.out.println("PlanA would cost you $" + PlanA);

        System.out.println("PlanB would cost you $" + PlanB);

        if (PlanA > PlanB) {
            System.out.println("Plan B is cheaper");

        }
        else if (PlanA < PlanB) {
            System.out.println("Plan A is cheaper");
            
        }
    }
}
