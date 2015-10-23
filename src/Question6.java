
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        //make new scanner

        System.out.println("Input number of daytime minutes:");
        //ask user for number of daytime minutes

        double dayMins = in.nextDouble();
        //input number of daytime minutes

        System.out.println("Input number of evening minutes:");
        //ask user for number of evening minutes

        double eveMins = in.nextDouble();
        //input number of evening minutes

        System.out.println("Input number of weekend minutes:");
        //ask user for weekend minutes

        double wkndMins = in.nextDouble();
        //input number of weekend minutes

        if (dayMins < 100) {
            dayMins = 100;
        }
        //if the amount of day minutes used is less than 100 set it to 100

        double planA = (dayMins - 100) * 0.25 + eveMins * 0.15 + wkndMins * 0.2;
        //calculate plan A free minutes

        if (dayMins < 250) {
            dayMins = 250;
        }
        //if the amount of day minutes used is less than 250 set it to 250

        double planB = (dayMins - 250) * 0.45 + eveMins * 0.35 + wkndMins * 0.25;
        //calcualate plan B free minutes

        System.out.println("Plan A costs " + planA + "$");
        //output the cost of plan A

        System.out.println("Plan B costs " + planB + "$");
        //output the cost of plan B

        if (planA < planB) {
            System.out.println("Plan A is the cheapest.");
        }
        //if plan a is less than plan b output plan a is the cheapest
        
        else if (planB < planA) {
            System.out.println("Plan B is the cheapest.");
        }
        //if plan b is less than plan a output plan b is the cheapest
        
        else if (planB == planA) {
            System.out.println("Plan A and plan B are the same.");
        }
        //if plan a and plan b cost the same output they cost the same

    }
}
