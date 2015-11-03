
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner (System.in);
        
        //Get number of daytime/evening/weekend minutes
        System.out.println("Number of daytime minutes?");
        double daytimeMinutes = input.nextDouble();
        System.out.println("Number of evening minutes?");
        double eveningMinutes = input.nextDouble();
        System.out.println("Number of weekend minutes?");
        double weekendMinutes = input.nextDouble();
        
        //Calculate what plan is cheaper
        double planADaytime = (daytimeMinutes - 100) * 25 / 100.0;
        double planAEvening = eveningMinutes * 15 / 100.0;
        double planAWeekend = weekendMinutes * 20 / 100.0;
        double planATotal = planADaytime + planAEvening + planAWeekend;
        double planBDaytime = (daytimeMinutes - 250) * 45 / 100.0;
        double planBEvening = eveningMinutes * 35 / 100.0;
        double planBWeekend = weekendMinutes * 25 / 100.0;
        double planBTotal = planBDaytime + planBEvening + planBWeekend;
        
        //Tell user whic one is cheaper
        System.out.println("Plan A costs $" + planATotal);
        System.out.println("Plan B costs $" + planBTotal);
        if(planATotal > planBTotal){
            System.out.println("Plan B is cheapest");
        }if(planATotal < planBTotal){
            System.out.println("Plan A is cheapest");
        }if(planATotal == planBTotal){
           System.out.println("Plan A and Plan B are the same price");
        }
    }
}
