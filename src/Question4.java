/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author mitrm7692
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a new Scanner
        Scanner input = new Scanner(System.in);
        
        // Make Scanner ask for cost of food
        System.out.println("How much does the food for prom cost?");
        
        //input cost of food
        double Food = input.nextDouble();
        
        // Make Scanner ask for cost of DJ
        System.out.println("How much does the DJ cost?");
        
        //input cost of DJ
        double DJ = input.nextDouble();
        
        // Make Scanner ask for cost of rent for hall
        System.out.println("How much does it cost to rent the hall?");
        
        //input cost of Hall
        double Hall = input.nextDouble();
        
        // Make Scanner ask for cost of decorations
        System.out.println("How much does decorations cost?");
        
        //input cost of Decorations
        double Decorations = input.nextDouble();
        
        // Make Scanner ask for cost of staff
        System.out.println("How much does it cost for staff?");
        
        //input cost of Staff
        double Staff = input.nextDouble();
        
        // Make Scanner ask for cost of miscellaneous things
        System.out.println("How much for miscellaneous costs?");
        
        //input cost of micsellaneous things
        double Misc = input.nextDouble();
        
        //Add all costs to make a total
        double TotalCost = Food+DJ+Hall+Decorations+Staff+Misc;
        
        //Divide total cost by 35 to find out how many tickets are needed
        double TicketsNeeded = Math.ceil(TotalCost/35);
        
        //Make scanner say total cost and how many tickets are needed
        System.out.println("Your total cost is $"+TotalCost+". You will need to sell "+TicketsNeeded+" Tickets");
        
        // finishing with the Scanner
        input.close();
    }
}






