
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Number of day time minutes?"); 
        //stores the int entered for day time
        int dayMin = input.nextInt();
        
        System.out.println("Number of evening minutes?");
       //stores the in entered for evening min
        int eveMin = input.nextInt();
        
        System.out.println("Number of weekend minutes");
       //stores the int entered for weekend min
        int endMin = input.nextInt();
        
       //plan A
        //subtracts entered free min from used min
        int NoOfMinDuringDayA = dayMin - 100;
        //prevents number from being nagative
        if(NoOfMinDuringDayA <0){
            NoOfMinDuringDayA = 0; 
        }
        //times number of min by cost per min
        double costDayA = NoOfMinDuringDayA * 0.25;
        
        //times number of evening min by cost
        double costEveA = eveMin * 0.15;
        
                //times number of weekend min by cost
    double endCostA = endMin * 0.20;
    //calculates total cost for plan A
    double totalA = costDayA + costEveA + endCostA;
       //rounds total to whole number
    totalA = Math.round(totalA *100)/100;
    
        
        
        // plan B 
        //subtracts entered free min from used min
        
        int NoOfMinDuringDayB = dayMin - 250;
        //prevents number from being nagative
        if(NoOfMinDuringDayB <0){
            NoOfMinDuringDayB = 0; 
        }
    //calculates cost of day time min
        double costDayB = NoOfMinDuringDayB *0.45;
    //calculates cost of evening min
    double costEveB = eveMin *0.35;
    //calculates cost of weekend min
    double endCostB = endMin *0.25;
    //calculates total cost for B
    double totalB = costDayB + costEveB + endCostB;
    //rounds total to whole number
    totalB = Math.round(totalB *10)/10;
   
    System.out.println("plan A cost " + totalA);
        System.out.println("Plan B cost "+ totalB);
    //if total A is larger then B 
        if(totalA <totalB){
            System.out.println("plan A is cheapest");
        }
    //if total B is mo
        if(totalB<totalA){
        System.out.println("Plan B is cheapest");
    }
    
    if(totalA ==totalB){
        System.out.println("Plan A and B are the same");
    }
    
    }
}
