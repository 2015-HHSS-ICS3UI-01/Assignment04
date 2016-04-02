
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Number of daytime minutes?");
        double day = input.nextDouble();

        System.out.println("Number of evening minutes?");
        double even = input.nextDouble();

        System.out.println("Number of weekend minutes?");
        double week = input.nextDouble();

        // Saving both A & B
        double dayA = (day - 100) * 0.25;
        if (dayA < 0) {
            dayA = 0;
        }
        double A = dayA + (even * 0.15) + (week * 0.20);

        double dayB = (day - 250) * 0.45;
        if (dayB < 0) {
            dayB = 0;
        }
        double B = dayB + (even * 0.35) + (week * 0.25);

        System.out.println("Plan A costs $" + A + ".");
        System.out.println("Plan B costs $" + B + ".");
        if (A == B) {
            System.out.println("Plan A and B are the same price.");
        } else if (A > B) {
            System.out.println("Plan B is cheapest.");
        } else if (B > A) {
            System.out.println("Plan A is cheapest.");
        }
    }
}