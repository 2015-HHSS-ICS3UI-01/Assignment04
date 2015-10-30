
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a Scanner
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Number of daytime minutes?: ");
        double Daytime = input.nextDouble();
        
        System.out.print("Number of evening minutes? ");
        double Evening = input.nextDouble();
        
        System.out.print("Number of weekend minutes ");
        double Weekend = input.nextDouble();
        
        //Figureing out minutes for daytime for plan a and b
        double daytimeA = 100;
        double totalMinutesA = Daytime - daytimeA;
        double daytimeTotalA = totalMinutesA * 0.25;
        
        double daytimeB = 250;
        double totalMinutesB = Daytime - daytimeB;
        double daytimeTotalB= totalMinutesB * 0.45;
        
        //evening
        
        double eveningA = Evening * 0.15;
        double eveningB = Evening * 0.35;
        
        //Find out the minutes on the weekend
        double weekendA = Weekend * 0.20;
        double weekendB = Weekend * 0.25;
        
        //Total minutes for each plan
        double planA = daytimeTotalA + eveningA + weekendA;
        double planB = daytimeTotalB + eveningB + weekendB;
        
        System.out.println("Plan A costs " + planA);
        System.out.println("Plan B costs " + planB);
        
        //Prices for each Plan
        if(planA > planB){
            System.out.println(" Plan A is Cheaper ");
        }else if (planA < planB) {
        System.out.println("Plan B is cheaper ");
    } else {
            System.out.println(" both Plans are the same");
}
                
                
               
        
        
        
        
        
        
        
    }
}
