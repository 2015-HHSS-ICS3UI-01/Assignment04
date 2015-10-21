
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
        //makes the computer display "Number of daytime minutes?" on the screen
        System.out.println("Number of daytime minutes?");
        //puts the input from the user into a variable "daytimemin"
        double daytimemin = input.nextDouble();
        //makes the computer display "Number of evening minutes?" on the screen
        System.out.println("Number of evening minutes?");
        //puts the input from the user into a variable "eveningmin"
        double eveningmin = input.nextDouble();
        //makes the computer display "Number of weekend minutes?" on the screen
        System.out.println("Number of weekend minutes?");
        //puts the input from the user into a variable "weekendmin"
        double weekendmin = input.nextDouble();

        //makes variable "daytimepa" by subtracting 100 from daytimemin
        double daytimepa = (daytimemin - 100);
        //makes variable "costdaytimepa" by multiplying daytimepa by 0.25
        double costdaytimepa = (daytimepa * 0.25);
        //makes variable "costeveningpa" by multiplying eveningmin by 0.15
        double costeveningpa = (eveningmin * 0.15);
        //makes variable "costweekendpa" by multiplying weekendmin by 0.20
        double costweekendpa = (weekendmin * 0.20);
        //makes variable "totalcostpa" by adding costdaytimepa, costeveningpa and costweekendpa together
        double totalcostpa = (costdaytimepa + costeveningpa + costweekendpa);

//makes variable "daytimepb" by subtracting 250 from daytimemin
        double daytimepb = (daytimemin - 250);
        //makes variable "costdaytimepb" by multiplying daytimepb by 0.45
        double costdaytimepb = (daytimepb * 0.45);

        //if daytimepb is less than zero, the following commands will be executed
        if (daytimepb < 0) {
            //variable "costdaytimepb" now equals 0
            costdaytimepb = 0;
        }
        //makes variable "costeveningpb" by multiplying eveningmin by 0.35
        double costeveningpb = (eveningmin * 0.35);
        //makes variable "costweekendpb" by multiplying weekendmin by 0.25
        double costweekendpb = (weekendmin * 0.25);
        //makes variable "totalcostpb" by adding costdaytimepb, costeveningpb and costweekendpb together 
        double totalcostpb = (costdaytimepb + costeveningpb + costweekendpb);
//makes the computer display "Plan A costs " and the variable "totalcostpa" on the screen
        System.out.println("Plan A costs " + totalcostpa);
        //makes the computer display "Plan B costs " and the variable "totalcostpb" on the screen
        System.out.println("Plan B costs " + totalcostpb);
//if totalcostpb is more than than totalcostpa, the following commands will be executed
        if (totalcostpb > totalcostpa) {
            //makes the computer display "Plan A is cheaper" on the screen
            System.out.println("Plan A is cheaper");
        }
        //if totalcostpb is less than totalcostpa, the following commands will be executed
        if (totalcostpb < totalcostpa) {
            //makes the computer display "Plan B is cheaper" on the screen
            System.out.println("Plan B is cheaper");
        }
        //if totalcostpb is equal to than totalcostpa, the following commands will be executed
        if (totalcostpb == totalcostpa) {
            //makes the computer display "Plan A and B are the same price" on the screen
            System.out.println("Plan A and B are the same price");
        }




    }
}
