
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create an integer  and double to store a variable 
        int daytime;
        int evening;
        int weekend;
        double planA = 0;
        double planB = 0;

        // Number of minutes the customer used in daytime
        System.out.println("Number of daytime minutes?");
        daytime = in.nextInt();

        // Number of minutes the customer used in evening
        System.out.println("Number of evening minutes?");
        evening = in.nextInt();

        // Number of minutes the customer used in weekend
        System.out.println("Number of weekend minutes?");
        weekend = in.nextInt();

        // If the customer used less than 100 minutes for Plan A
        if (daytime < 100) {
            planA = ((evening * 0.15) + (weekend * 0.20));
        } else {
            // If the customer exceeds 100 minutes
            planA = ((daytime - 100) * 0.25 + (evening * 0.15) + (weekend * 0.20));
        }

        // If the customer used less than 250 minutes for Plan B
        if (daytime < 250) {
            planB = ((evening * 0.35) + (weekend * 0.25));
        } else {
            // If the customer exceeds 250 minutes
            planB = ((daytime - 250) * 0.45 + (evening * 0.35) + (weekend * 0.25));
        }

        //Round the answers to the nearest decimal 
        planA = Math.round(planA * 100) / 100.0;
        planB = Math.round(planB * 100) / 100.0;

        // Output our sentence to the user letting them know what they entered
        System.out.println("Plan A Costs " + planA);
        System.out.println("Plan B Costs " + planB);

        // Comparision Between Plan A & Plan B
        if (planA < planB) {
            System.out.println("Plan A is Cheapest.");
        } else if (planA > planB) {
            System.out.println("Plan B is Cheapest.");
        } else if (planA == planB) {
            System.out.println("Plan A and B are the same price.");
        }


    }
}
