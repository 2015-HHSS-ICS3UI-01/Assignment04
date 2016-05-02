
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author godie2014
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double daytime;
        Double evening;
        Double weekend;
        Double planA;
        Double planB;
        System.out.println("Number of daytime minutes?");
        daytime = input.nextDouble();
        System.out.println("Number of evening minutes?");
        evening = input.nextDouble();
        System.out.println("Number of weekend minutes?");
        weekend = input.nextDouble();

        System.out.println(" Plan A = " + ((daytime - 100 * 0.25) + (evening * 0.15) + (weekend * 0.20)));
        System.out.println(" Plan B = " + ((daytime - 250 * 0.45) + (evening * 0.35) + (weekend * 0.25)));

        if (planA < planB) {
            System.out.printIn("Plan A is the cheapest.");

            if (planB < planA) {
                System.out.printIn("Plan B is cheapest.");
                       
                       if (planB == planA) {
                    System.out.printIn("Plan A and B are the same price.");
                                   
                }
            }
        }
    }
}
