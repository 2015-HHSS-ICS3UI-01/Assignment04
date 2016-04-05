
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit");
        int sl = input.nextInt();

        System.out.println("Enter the recorded speed of the car");
        int sc = input.nextInt();



        if (sc <= sl) {


            System.out.println("Congratulations, you are within the speed limit!");

        } else if (sc > sl) {





            int fine = (sc - sl);

            if (fine > 1 && fine < 20) {
                System.out.println("Your speeding and your fine is $100");
            }
            if (fine > 21 && fine < 30) {
                System.out.println("Your speeding and your fine is $270");
            }
            if (fine > 31) {
                System.out.println("Your speeding and your fine is $500");
            }
        }

    }
}