
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Number of daytime minutes?");
        int day = input.nextInt();
        System.out.println("Number of evening minutes?");
        int night = input.nextInt();
        System.out.println("Number of weekend minutes?");
        int weekend = input.nextInt();
        double daytotalA = day*0.25 - 25;
        double eveningtotalA = night*0.15;
        double weekendtotalA = weekend*0.2;
        double PlanA = daytotalA + eveningtotalA + weekendtotalA;
        double daytotalB = day*0.45 - 112.5;
        double eveningtotalB = night*0.35;
        double weekendtotalB = weekend*0.25;
        if(daytotalA < 0){
            daytotalA = 0;
        }
        if(daytotalB < 0){
            daytotalB = 0;
        }
        double PlanB = daytotalB + eveningtotalB + weekendtotalB;
        System.out.println("Plan A costs " + PlanA);
        System.out.println("Plan B costs " + PlanB);
        if(PlanA > PlanB){
            System.out.println("Plan B is cheapest.");
        }
        if(PlanA < PlanB){
            System.out.println("Plan A is cheapest.");
        }
        if(PlanA == PlanB){
            System.out.println("Plan A and B are the same price.");
        }
    }
}
