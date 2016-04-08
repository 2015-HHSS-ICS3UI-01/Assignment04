
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the speed limit on the road you are on.");
        double speedlimit = input.nextDouble();

        System.out.println("Please enter the speed at which you're travelling at.");
        double speed = input.nextDouble();

        if (speed <= speedlimit) {
            System.out.println("Congratulations! You're within the speed limit!");
        } else if (speed > speedlimit) {

            double fine = (speed - speedlimit);

            if (fine > 1 && fine <= 20) {
                System.out.println("You are above the speed limit and will be fined $100.");
            }

            if (fine > 21 && fine <= 30) {
                System.out.println("You are above the speed limit and will be fined $270.");
            }

            if (fine >= 31) {
                System.out.println("You are above the speed limit and will be fined $500.");
            }
        }
    }
}
