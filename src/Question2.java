
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the measurement in inches you wish to convert:");
        double number = input.nextDouble();
        double cm = 2.54 * number;
        cm = Math.round(cm * 100) / 100.0;

        System.out.println(number + " inches is the same as " + cm + " cm");

        input.close();
    }
}
