
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called "input"
        Scanner input = new Scanner(System.in);
        //makes the computer display the following on the screen
        System.out.println("Number of daytime minutes?");
        double daytimemin = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("Number of evening minutes?");
        double eveningmin = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("Number of weekend minutes?");
        double weekendmin = input.nextDouble();

        //makes new variables by using previous variables
        double daytimepa = (daytimemin - 100);
        double costdaytimepa = (daytimepa * 0.25);
        double costeveningpa = (eveningmin * 0.15);
        double costweekendpa = (weekendmin * 0.20);
        double totalcostpa = (costdaytimepa + costeveningpa + costweekendpa);


        double daytimepb = (daytimemin - 250);
        double costdaytimepb = (daytimepb * 0.45);

        //if daytimepb is less than zero, the following commands will be executed
        if (daytimepb < 0) {
            costdaytimepb = 0;
        }
        //makes new variables by using previous variables
        double costeveningpb = (eveningmin * 0.35);
        double costweekendpb = (weekendmin * 0.25);
        double totalcostpb = (costdaytimepb + costeveningpb + costweekendpb);
//makes the computer display the following on the screen
        System.out.println("Plan A costs " + totalcostpa);
        System.out.println("Plan B costs " + totalcostpb);
//if totalcostpb is more than than totalcostpa, the following commands will be executed
        if (totalcostpb > totalcostpa) {
            //makes the computer display the following on the screen
            System.out.println("Plan A is cheaper");
        }
        //if totalcostpb is less than totalcostpa, the following commands will be executed
        if (totalcostpb < totalcostpa) {
            //makes the computer display the following on the screen
            System.out.println("Plan B is cheaper");
        }
        //if totalcostpb is equal to than totalcostpa, the following commands will be executed
        if (totalcostpb == totalcostpa) {
            //makes the computer display the following on the screen
            System.out.println("Plan A and B are the same price");
        }




    }
}
