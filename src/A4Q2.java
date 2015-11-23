
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Put in a numer of inches:");
        Scanner inches = new Scanner(System.in);
        double cent = inches.nextDouble()*2.54;
        System.out.println("There are " + cent + "centimerters in " +cent/2.54+" inches.");
    }
}
