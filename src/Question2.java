
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Communicate with user
        System.out.println("Please enter the measurement in inches you wish to convert");

        //Create Scanner for input
        Scanner input = new Scanner(System.in);

        //Convert measurement
        int number = input.nextInt();
        double answer = number * 2.54;
        System.out.println(number + " inches is equal to " + answer + " centimetres. ");
    }
}
