
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your measurement in inches");

        double inch = input.nextDouble();
        double cm = (double) (inch * 2.54);

        System.out.println(inch + " inches is the same measurement as " + cm + " cm");
        System.out.println("There ya go!");
    }
}
