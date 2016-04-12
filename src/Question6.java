
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Number of daytime minutes?");
        double day = input.nextDouble();
        System.out.println("Number of evening minutes?");
        double even = input.nextDouble();
        System.out.println("Number of weekend minutes?");
        double week = input.nextDouble();
        //gather and store the number of minutes in each time of day
        double day1 = day - 100;
        if (day1 < 100) {
            day1 = 0;
        }
        double plana = ((day1 * 0.25) + (even * 0.15) + (week * 0.20));

        double day2 = day - 250;
        if (day2 < 250) {
            day2 = 0;
        }
        double planb = ((day2 * 0.45) + (even * 0.35) + (week * 0.25));
        //calculations for costs of each plan
        System.out.println("Plan A costs $" + plana);
        System.out.println("Plan B costs $" + planb);
        //output prices
        if (plana > planb) {
            System.out.println("Plan B is cheaper.");
        } else {
            System.out.println("Plan A is cheaper.");
        }
        //output which is the better deal
    }
}
