
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Number of daytime minutes?");
        double day = input.nextDouble();

        System.out.println("Number of evening minutes?");
        double eve = input.nextDouble();

        System.out.println("Number of weekend minutes?");
        double wend = input.nextDouble();

        double da = (day - 100) * 0.25;
        da = Math.max(0, da);
        double ea = eve * 0.15;
        double wa = wend * 0.2;
        double plana = da + ea + wa;
        plana = Math.round(plana * 100) / 100.0;

        System.out.println("Plan A costs " + plana);

        double db = (day - 250) * 0.45;
        db = Math.max(0, db);
        double eb = eve * 0.35;
        double wb = wend * 0.25;
        double planb = db + eb + wb;
        planb = Math.round(planb * 100) / 100.0;

        System.out.println("Plan B costs " + planb);

        if (plana > planb) {
            System.out.println("Plan B is cheapest.");
        } else if (plana < planb) {
            System.out.println("Plan A is cheapest.");
        } else if (plana == planb) {
            System.out.println("Plan A and B are the same price.");
        }

        input.close();
    }
}
