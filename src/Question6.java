
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Get input from user
        //For daytime minutes
        System.out.print("Number of daytime minutes?: ");
        int day = input.nextInt();

        //For evening minutes
        System.out.print("Number of evening minutes?: ");
        int night = input.nextInt();

        //For weekend mintues
        System.out.print("Number of weekend minutes?: ");
        int week = input.nextInt();

        //If number of minutes is less than total, set number of mins to 100
        if (day < 100) {
            day = 100;
        }
        //Figure out cost of plan A
        double PlanA = (day - 100) * 0.25 + night * 0.15 + week * 0.20;

        //Show user results for plan A
        System.out.println("Plan A costs: " + PlanA);

        //Round total to two decimal places
        PlanA = Math.round(PlanA * 100) / 100.0;

        //If number of minutes is less than total, set number of mins to 250
        if (day < 250) {
            day = 250;
        }
        //Figure out cost of Plan B
        double PlanB = (day - 250) * 0.45 + night * 0.35 + week * 0.25;

        //Round total to two decimal places
        PlanB = Math.round(PlanB * 250) / 250.0;

        //show user results for Plan B
        System.out.println("Plan B costs: " + PlanB);

        //Calculate cheapest option
        if (PlanA < PlanB) {
            System.out.println("Plan A is the cheapest.");
        } else {
            System.out.println("Plan B is the cheapest.");
        }
        //Display to user if they are the same
        if (PlanA == PlanB) {
            System.out.println("Plan A and B cost the same.");
        }
    }
}
