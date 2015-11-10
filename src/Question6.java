
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of daytime minutes?");
        double daytime = input.nextDouble();
        System.out.println("Number of evening minutes?");
        double evening = input.nextDouble();
        System.out.println("Number of weekend minutes?");
        double weekend = input.nextDouble();
        //find the costs for plan A
        double costAEvening = (evening * 0.15);
        double costAWeekend = (weekend * 0.20);
        double costADaytime = ((daytime - 100) * 0.25);

        if (costADaytime <= 0) {
            costADaytime = 0;

        }
        double totalA = (costAEvening + costAWeekend + costADaytime);
        System.out.println("Plan A is $" + totalA);
        //find the costs for plan B
        double costBEvening = (evening * 0.35);
        double costBWeekend = (weekend * 0.25);
        double costBDaytime = ((daytime - 200) * 0.45);

        double totalB = (costBEvening + costBWeekend + costBDaytime);
        System.out.println("Plan B is $" + totalB);
        //let the plan chooser know which plan is cheapest
        if (totalB < totalA) {
            System.out.println("Plan B is the cheapest.");
        } else {
            System.out.println("Plan A is the cheapest.");


        }//What if the totals are equal?
        if (totalB == totalA) {
            System.out.println("Plan A and B are equal.");
        }

    }
}
