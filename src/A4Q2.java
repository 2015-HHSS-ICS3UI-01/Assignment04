
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String number;

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, please enter the unit of which you want me to convert in inches.");
        double inches = input.nextDouble();
        double cm = inches * 2.54;

        System.out.println("The number you said of " + inches + " is equal to " + cm + " in centimetres");

    }
}
