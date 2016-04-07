
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //number in inches variable
        
        System.out.print("Please enter the measurement in inches you wish to convert:");
        double inchnum = in.nextDouble();
        double conversion = inchnum * 2.54;
        System.out.println( inchnum + " is the same as " + conversion);
    }
}
