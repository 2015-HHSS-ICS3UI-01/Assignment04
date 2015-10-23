
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sami
 */
public class Question06 {

    public static void main(String[] args) {

        //make a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("See which plan is best for you!");

        //asks user the number of daytime, evening and weekend minutes
        System.out.print("Enter the number of daytime minutes: ");
        int daytimeMinutes = input.nextInt();

        System.out.print("Enter the number of evening minutes: ");
        int eveningMinutes = input.nextInt();

        System.out.print("Enter the number of weekend minutes: ");
        int weekendMinutes = input.nextInt();

        //calculates how many minutes user has gone over on plan A
        double daytimeA = 100;
        double totalMinutesA = daytimeMinutes - daytimeA;
        double daytimeTotalA = totalMinutesA * 0.25;

        //calculates how many minutes user has gone over on plan B
        double daytimeB = 250;
        double totalMinutesB = daytimeMinutes - daytimeB;
        double daytimeTotalB = totalMinutesB * 0.45;

        //calculates amount to pay on evening minutes
        double eveningA = eveningMinutes * 0.15;
        double eveningB = eveningMinutes * 0.35;

        //calculates amount to pay on weekend minutes
        double weekendA = weekendMinutes * 0.20;
        double weekendB = weekendMinutes * 0.25;

        //add up the total for plan A and plan B
        double planA = daytimeTotalA + eveningA + weekendA;
        double planB = daytimeTotalB + eveningB + weekendB;

        //shows user the prices of plan A and plan B
        System.out.println("Plan A costs: $" + planA);
        System.out.println("Plan B costs: $" + planB);

        //Math.ceil(planA);
        //Math.floor(planA);
        //tells user which plan would be cheaper
        if (planA < planB) {
            System.out.println("Plan A is the cheapest.");
        } else if (planA > planB) {
            System.out.println("Plan B is the cheapest.");
        } else {
            System.out.println("Both plans cost the same.");
        }
    }
}
