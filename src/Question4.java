/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author whitb0039
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        //make new scanner
        
        System.out.println("How much does the food for prom cost?");
        //ask user how much food costs
        
        double foodCost = in.nextDouble();
        //input cost of food
        
        System.out.println("How much does the DJ cost?");
        //ask user how much the DJ costs
        
        double djCost = in.nextDouble();
        //input cost of DJ
        
        System.out.println("How much does it cost to rent the hall?");
        //ask user how much the the hall costs to rent
        
        double hallCost = in.nextDouble();
        //input cost of hall
        
        System.out.println("How much does the decorations cost?");
        //ask user how much the decorations costs
        
        double decorationsCost = in.nextDouble();
        //input cost of decorations
        
        System.out.println("How much does it cost for the staff?");
        //ask user how much the staff costs
        
        double staffCost = in.nextDouble();
        //input cost of staff
        
        System.out.println("How much does everything else cost?");
        //ask user how much the everything else costs
        
        double miscellaneousCost = in.nextDouble();
        //input cost of everything else
        
        double totalCost = foodCost+djCost+hallCost+decorationsCost+staffCost+miscellaneousCost;
        //calculate total cost of everything
        
        double ticketsNeeded = Math.ceil(totalCost/35);
        //calculate number of tickets needed to break even
        
        System.out.println("The total cost is $"+totalCost+" you will need to sell "+ticketsNeeded+" tickets to break even.");
        //output total cost and how many tickets are needed to be sold  
    }
}
