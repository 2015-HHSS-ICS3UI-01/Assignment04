
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new Scanner
        Scanner input = new Scanner(System.in);

        // Make Scanner ask for amount of daytime minutes
        System.out.println("Please enter the amount of daytime minutes");

        // Type amount of daytime minutes
        double dayTimeMins = input.nextDouble();

        // Make Scanner ask for amount of evening minutes
        System.out.println("Please enter the amount of evening minutes");

        // Type amount of evening minutes
        double eveningMins = input.nextDouble();

        // Make Scanner ask for amount of weekend minutes
        System.out.println("Please enter the amount of weekend minutes");

        // Type amount of weekend minutes
        double weekendMins = input.nextDouble();

        //Makes daytime minutes equal 100 if daytime minutes are less than 100
        if (dayTimeMins < 100) {
            dayTimeMins = 100;
        }

        //Calculate the cost of PlanA
        double planA = (dayTimeMins - 100) * .25 + eveningMins * .15 + weekendMins * .20;

        //Round the cost of PlanA by 2 decimal places
        planA = Math.round(planA * 100) / 100.0;

        //Make scanner say "Plan A costs $...."
        System.out.println("Plan A costs " + "$" + planA);

        //Makes daytime minutes equal 250 if daytime minutes are less than 250
        if (dayTimeMins < 250) {
            dayTimeMins = 250;
        }

        //Calculate the cost of PlanB
        double planB = (dayTimeMins - 250) * .45 + eveningMins * .35 + weekendMins * .25;

        //Round the cost of PlanB by 2 decimal places
        planB = Math.round(planB * 100) / 100.0;

        //Make scanner say "Plan B costs $...."
        System.out.println("Plan B costs " + "$" + planB);

        //If PlanB is more expensive scanner says "Plan A is cheapest"
        if (planA < planB) {
            System.out.println("Plan A is cheapest");
        } //If PlanA is more expensive scanner says "Plan B is cheapest"
        else if (planA > planB) {
            System.out.println("Plan B is cheapest");
        } //If both plans are the same cost scanner says "Plan A and B are the same price"
        else if (planA == planB) {
            System.out.println("Plan A and B are the same price");
        }
        //finish with scanner
        input.close();
    }
}
