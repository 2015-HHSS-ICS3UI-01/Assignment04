
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //convert inches to centimeters
        System.out.println("Please enter the measurement you wish to convert.");
        double Inches = input.nextDouble();
        double centimeters = (Inches * 2.54);
        System.out.println(Inches + " inches is the same as " + centimeters + "cm.");
    }
}
