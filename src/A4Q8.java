
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates scanner
        Scanner in = new Scanner(System.in);

        //create integer for position on the board
        int spot = 1;

        //make while loop to continue asking sum of dice
        //and output the square user is on
        while (spot >= 1 && spot <= 100) {

            System.out.println("Enter sum of dice:");
            int sum = in.nextInt();


            if (spot + sum > 100) {

                System.out.println("Roll again");
            } else {
                spot = spot + sum;
            }
            if (sum < 2 || sum > 12) {
                System.out.println("You quit!");
                break;
            }


            System.out.println("you are now on square " + spot);
            if (spot == 100) {
                System.out.println("You Win");
                break;
            }
            //make if statements for snakes
            if (spot == 54) {
                System.out.println("You landed on a snake");
                System.out.println("Go back to square 19");
                spot = 19;
            }
            if (spot == 90) {
                System.out.println("You landed on a snake");
                System.out.println("Go back to square 48");
                spot = 48;
            }
            if (spot == 99) {
                System.out.println("You landed on a snake");
                System.out.println("Go back to square 77");
                spot = 77;
            }
            //make if statements for ladders
            if (spot == 9) {
                System.out.println("You landed on a ladder");
                System.out.println("Move up to square 34");
                spot = 34;
            }
            if (spot == 40) {
                System.out.println("You landed on a ladder");
                System.out.println("Move up to square 64");
                spot = 64;
            }
            if (spot == 67) {
                System.out.println("You landed on a ladder");
                System.out.println("Move up to square 86");
                spot = 86;
            }
        }
    }
}