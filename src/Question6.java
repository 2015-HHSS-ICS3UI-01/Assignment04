
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Asks the daytime minutes
        System.out.print("Number of Daytime Minutes: ");
        double daytimeMinutes = input.nextInt();
        //Asks the evening minutes
        System.out.print("Number of Evening Minutes: ");
        double eveningMinutes = input.nextInt();
        //Asks the weekend minutes
        System.out.print("Number of Weekend Minutes: ");
        double weekendMinutes = input.nextInt();
        //Subtracts 100 from day time minutes and multiplies it by 0.25
        double Adaytime = (daytimeMinutes - 100)*0.25;
        //if daytime is less or equal to zero, it zero no matter what
        if (Adaytime <= 0)
        {
            Adaytime = 0;
        }
        //multiplies evening minutes by 0.15
        double Aevening = eveningMinutes*0.15;
        //multiplies weekend minutes by 0.15
        double Aweekend = weekendMinutes*0.20;
        //Plan A is equal to Daytime, Evening and Weekend for together plan A
        double PlanA = Adaytime + Aevening + Aweekend;
        //Subtracts 250 from day time minutes and multiplies it by 0.45
        double Bdaytime = (daytimeMinutes - 250)*0.45;
        if (Bdaytime <= 0)
        {
            //if daytime is less or equal to zero, it zero no matter what
            Bdaytime = 0;
        }
        //multiplies evening minutes by 0.35
        double Bevening = eveningMinutes*0.35;
        //multiplies weekend minutes by 0.25
        double Bweekend = weekendMinutes*0.25;
        //Plan B is equal to Daytime, Evening and Weekend together for plan B
        double PlanB = Bdaytime + Bevening + Bweekend;
        //Rounds both plans to the second Decimal number
        PlanA = Math.round(PlanA*100)/100.0;
        PlanB = Math.round(PlanB*100)/100.0;
        //Tells the price of the plans
        System.out.println("Plan A costs $" + PlanA);
        System.out.println("Plan B costs $" + PlanB);
        //If Plan A is smaller than Plan B, it will say Plan A is cheeper
        if (PlanA < PlanB)
        {
            System.out.println("Plan A is cheapest");
        }
        //If Plan B is smaller than Plan A, it will say Plan B is cheeper
        else if (PlanB < PlanA)
        {
            System.out.println("Plan B is cheapest");
        }
        //If Plan A is equal to Plan B, it will say both are the same
        else if (PlanA == PlanB)
        {
            System.out.println("Plan A and B are the same price");
        }
        
    }
}
