
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name.");
        name = input.nextLine();

        System.out.println("Hello " + name + " I will be calculating the best cell phone plan for you.");
        System.out.println("How many daytime minutes do you use?");
        int daymin = input.nextInt();

        System.out.println("Please enter the number of evening minutes you use.");
        int evemin = input.nextInt();

        System.out.println("Please enter the amount of minutes used on the weekend.");
        int weekmin = input.nextInt();

        double atotal = ((daymin - 100) * 0.25) + (evemin * 0.15) + (weekmin * 0.20);

        double btotal = ((daymin - 250) * 0.45) + (evemin * 0.35) + (weekmin * 0.25);

        if (daymin < 0); 
        {
            daymin = 0;
        }

        System.out.println("Plan A will cost " + atotal + " in total.");
        System.out.println("Plan B will cost " + btotal + " in total.");

        if (atotal < btotal) {
            System.out.println("Plan A is the cheapest option.");
        }
        if (atotal > btotal) {
            System.out.println("Plan B is the cheapest option.");
        }
        if (atotal == btotal) {
            System.out.println("The two plans are equal in price.");
        }
    }
}
