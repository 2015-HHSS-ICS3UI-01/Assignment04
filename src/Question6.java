
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matt
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        //get user input daytime mins
        System.out.println("How many daytime minutes?");

        double daytimeMins = input.nextDouble();
        //get user input evening mins
        System.out.println("How many evening minutes?");

        double eveningMins = input.nextDouble();
        //get user input weekend mins
        System.out.println("How many weekend minutes?");

        double weekendMins = input.nextDouble();
        //calculate cheapest plan
        System.out.println("Thank you. I'll calculate your cheapest plan...");
        //assume we will only use free minutes
        double daytimePriceA = 0;
        //if we go over our free minutes...
        if(daytimeMins > 100){
        //...then calculate the price    
            daytimePriceA = (daytimeMins-100)*.25;
        }
        //caluclate the remaining non-free minutes
        double eveningPriceA = eveningMins*.15;
        double weekendPriceA = weekendMins*.20;
        //calculate price for plan B in same manner as plan A
        double daytimePriceB = 0;
        if(daytimeMins > 250){
            
            daytimePriceB = (daytimeMins-250)*.45;
            
        }
        double eveningPriceB = eveningMins*.35;
        double weekendPriceB = weekendMins*.25;
        //find both prices respectively
        double pricePlanA = daytimePriceA+eveningPriceA+weekendPriceA;
        
        double pricePlanB = daytimePriceB+eveningPriceB+weekendPriceB;
        //output prices
        System.out.println("The price for Plan A is " + pricePlanA);
        System.out.println("The price for Plan B is " + pricePlanB);
        //find which plan is cheapest based on the above calculations, and output that information
        if (pricePlanA > pricePlanB){
            System.out.println("Plan B is the cheapest plan.");
        }else if(pricePlanA<pricePlanB){
            System.out.println("Plan A is the cheapest plan.");
        }else{
            System.out.println("Both plans are the same price.");
        }

    }

}
