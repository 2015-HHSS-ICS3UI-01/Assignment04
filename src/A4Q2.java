
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the measurement in inches you wish to convert");
        double inch = input.nextDouble();
        double conversion = inch * 2.54;
        System.out.println(inch + " inches is the same as " + conversion);
        

    }
}
