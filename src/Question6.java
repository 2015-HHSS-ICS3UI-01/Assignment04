
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create scanner
        Scanner input = new Scanner(System.in);
        //ask user number of minutes for each situation
        System.out.println("Number of Daytime Minutes: ");
        double daytime = input.nextDouble();
        
        System.out.println("Number of Evening Minnutes");
        double evening = input.nextDouble();
        
        System.out.println("Number of Weekend minutes");
        double weekend = input.nextDouble();
        
        //find cost of plan A
        //subtract 100 from equation (100 free minutes)
        double costPlanAdaytime = ((daytime - 100) * 0.25);
        //ensure program does not output negative number
        if(costPlanAdaytime <= 0)
        {
            costPlanAdaytime = 0;
        }
        //calculate cost for each time of day/week based on info givenj
        double costPlanAevening = (evening * 0.15);
        double costPlanAweekend = (weekend * 0.20);
        //find total cost by adding
        double totalA = (costPlanAdaytime + costPlanAevening + costPlanAweekend );
       
        //find cost of plan B
        //subtract 250 from equation (250 free minutes)
        double costPlanBdaytime = ((daytime - 250) * 0.45);
        //ensure program does not output negative number
        if(costPlanBdaytime <= 0)
        {
            costPlanBdaytime = 0;
        }
        //calculate cost for each time of day/week based on info given
        double costPlanBevening = (evening * 0.35);
        double costPlanBweekend = (weekend * 0.25);
        //find total cost by adding
        double totalB = (costPlanBdaytime + costPlanBevening + costPlanBweekend );

        //round number to 2 decimals(because its money)
        totalA = Math.round(totalA*100)/100;
        totalB = Math.round(totalB*100)/100;
        //output final cost to user 
        System.out.println("The cost of Plan A is: " + totalA);
        System.out.println("The cost of Plan B is: " + totalB);
        //check if plans are equal in cost
        if(totalA == totalB){
            System.out.println("Both plans are equal in cost.");
        }else{
        //compare totals to see which is larger and output appropraite response
        if(totalA > totalB)
        {
            System.out.println("Plan B is less expensive.");
        }else{
            System.out.println("Plan A is less expenisive.");
        }
        }
    }
}
