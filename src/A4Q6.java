
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a new scanner
        Scanner input = new Scanner(System.in);

        //Ask for the number of minutes used during daytime, evening, and weekend. 
        System.out.println("Please put number of daytime minutes.");
        double day = input.nextDouble();

        System.out.println("Please put number of evening minutes.");
        double evening = input.nextDouble();

        System.out.println("Please put number of weekend minutes.");
        double weekend = input.nextDouble();

        //Calculate Plan A
        double DaytimeA = 0;
        if (day > 100)
        {
            DaytimeA = (day - 100) * .25;
        }

        double EveningA = (evening * .15);

        double WeekendA = (weekend * .20);

        double totalCostA = (DaytimeA + EveningA + WeekendA);

        //Calculate Plan B
        double DaytimeB = 0;
        if (day > 250){
             DaytimeB = (day - 250) * .45;
        }
       
        
        double EveningB = (evening * .35);

        double WeekendB = (weekend * .25);
        
        double totalCostB = (DaytimeB + EveningB + WeekendB);
        
        //Output the plan costs
        System.out.println("Plan A costs: $" + totalCostA);
        
        System.out.println("Plan B costs: $" + totalCostB);
        
        //Find out which plan is better
        
        if(totalCostB < totalCostA){
            System.out.println("Plan B is Cheaper.");
        }
        
         if(totalCostA < totalCostB){
            System.out.println("Plan A is Cheaper.");
        }
         
         if(totalCostA == totalCostB){
            System.out.println("Both plans are the same.");
        }
    }
}
