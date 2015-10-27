
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create an integer to store a number
        int FoodCost;
        int DJCost;
        int HallCost;
        int DecorationCost;
        int StaffCost;
        int ExtraCost;

        // Food cost
        System.out.println("How much does the food for prom cost?");
        double Food = in.nextDouble();

        // DJ cost
        System.out.println("How much does the DJ cost?");
        double DJ = in.nextDouble();

        // Rent cost
        System.out.println("How much does it cost to rent the hall?");
        double Hall = in.nextDouble();

        // Decorations Cost 
        System.out.println("How much does decorations cost?");
        double Decoration = in.nextDouble();

        // Staff cost
        System.out.println("How much does it cost for staff?");
        double Staff = in.nextDouble();

        // Miscellaneous cost
        System.out.println("How much for miscellaneous costs?");
        double Extra = in.nextDouble();

        // Total Prom cost
        double TotalCost = (Food + DJ + Hall + Decoration + Staff + Extra);

        // Output our sentence to the user letting them know what they entered
        System.out.println("The total cost is $" + (Food + DJ + Hall + Decoration + Staff + Extra));


        // Output our sentence to the user letting them know what they entered
        System.out.println("You will need to sell " + Math.ceil(TotalCost / 35) + " tickets to break even.");


        // finishing with the Scanner
        in.close();


    }
}
