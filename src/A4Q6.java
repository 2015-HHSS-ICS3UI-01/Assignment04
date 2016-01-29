
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vickj2854
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // find best plan
        Scanner input = new Scanner(System.in);

        System.out.println("Number of daytime minutes?");

        double daytime = input.nextDouble();

        System.out.println("Number of evening minutes?");

        double evening = input.nextDouble();

        System.out.println("Number of weekend minutes?");

        double weekend = input.nextDouble();

        double totalA;
        if (daytime > 100) {
            totalA = 0.25 * (daytime - 100) + (evening * 0.15) + (weekend * 0.20);
        } else {
            totalA = (evening * 0.15) + (weekend * 0.20);
        }

        double totalB;
        if (daytime > 250) {
            totalB = 0.45 * (daytime - 250) + (evening * 0.35) + (weekend * 0.25);
        } else {
            totalB = (evening * 0.35) + (weekend * 0.25);

        }
        System.out.println("Plan A costs " + totalA);

        System.out.println("Plan B costs " + totalB);

        if (totalA > totalB) {

            System.out.println("Plan B is cheaper");

        }else if (totalB > totalA){
            System.out.println("Plan A is cheaper");
            
            
        }else{
            System.out.println("Plan A and B are the same price");
        }





    }
}
