
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Question6 {
    private static int dayTimeMinutes;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        //daytime minutes
        System.out.println(" Number of daytime minutes? ");
        double daytime = input.nextDouble();
        //evening minutes
        System.out.println(" Number of evening minutes? ");
        double evening = input.nextDouble();
        //weekend minutes
        System.out.println(" Number of weekend minutes? ");
        double weekend = input.nextDouble();
        
        // Get daytime to subtract 100 free minutes
        
        if (daytime<  100) { 
            daytime =100;
        }
        //calculate the cost for Plan A
        double PlanA = (daytime - 100) * .25 + evening * .15 + weekend * .20; 
        //round PlanA to 2 decimal places
        PlanA = Math.round(PlanA * 100) / 100.0;
        //make PlanA  cost
        System.out.println(" Plan A costs " + "$" + PlanA);
        
        //Get daytime to subtract 250 free minutes
        
        if (daytime< 250) {
            daytime =250;
        }
        //calculate the cost for Plan B
        double PlanB = (daytime - 250) * .45 + evening * .35 + weekend * .25;
        //round PlanB  to 2 decimal places
        PlanB = Math.round(PlanB * 100) / 100.0;
        //Make PlanB cost
        System.out.println(" Plan B costs " + "$" + PlanB) ;
        //is PlanA Cheaaper
        if (PlanA < PlanB) {
            System.out.println(" Plan A is cheapest.");
        }
        //Is PlanB Cheaper 
        if (PlanB < PlanA) {
            System.out.println(" Plan B is cheapest.");
        }
        //are the 2 prcies the same
        if (PlanA == PlanB) {
            System.out.println(" Plan A and B are the same price. ");
        }
       
    }
}
