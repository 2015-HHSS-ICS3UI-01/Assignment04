
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int spdlimit = 0;
        System.out.println("Enter the speed limit:");
        Scanner input = new Scanner(System.in);        //Create Scanner
        spdlimit = input.nextInt();
        System.out.println("Enter the recorded speed of the car:");
        int spd = input.nextInt();
        int comp = 0;
        if (spdlimit < spd) {
            comp = spd - spdlimit;
            if (comp <= 20 && comp >= 1) {
                System.out.println("You are speeding and your fine is $100");
            }
            if (comp <= 30 && comp >= 21) {
                System.out.println("You are speeding and your fine is $270");
            }
            if (comp >= 31) {
                System.out.println("You are speeding and your fine is $500");
            }
        }
        if (spdlimit > spd) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
