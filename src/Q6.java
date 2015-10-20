
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);

        //ask for number of daytime minutes
        System.out.println("Number of daytime minutes? ");
        int daytimeMinutes = input.nextInt();

        //ask for number of evening minutes
        System.out.println("Number of evening minutes? ");
        int eveningMinutes = input.nextInt();

        //ask for number of weekend minutes
        System.out.println("Number of weekend minutes? ");
        int weekendMinutes = input.nextInt();

        //how much plan A costs
        double planA = (daytimeMinutes - 100) * .25 + eveningMinutes * .15 + weekendMinutes * .20;     
        //state how much plan A costs
        System.out.println("Plan A costs: $" + planA);

        //how much plan B costs
        double planB = (daytimeMinutes - 250) * .45 + eveningMinutes * .35 + weekendMinutes * .25;
        //state how much plan B costs
        System.out.println("Plan B costs: $" + planB);

        //which plan is the cheepest
        //if plan A is cheepest
        if (planA < planB) {
            System.out.println("Plan A is the cheepest.");
            //if plan B is cheepest
        } else if (planB < planA) {
            System.out.println("Plan B is the cheepest.");
            //if they cost the same
        } else if (planA == planB) {
            System.out.println("Plan A and B are the same price.");

        }

    }
}
