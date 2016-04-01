
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the measurement in inches you wish to conevert: ");
        double inch = input.nextDouble();
        double cm = (inch * 2.54);
        System.out.println(inch + " inches is the same as " + cm + " cm");


    }
}
