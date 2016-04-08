
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int square = 1;
        boolean done = false;
        while (!done) {

            System.out.println("Enter sum of dice:");
            int sum = input.nextInt();

            if (sum < 2 || sum > 12) {
                System.out.println("You Quit!");
                done = true;
            } else if (sum >= 2 && sum <= 12) {
                square = square + sum;


                if (square == 9) {
                    square = square + 25;
                }
                if (square == 40) {
                    square = square + 24;
                }
                if (square == 67) {
                    square = square + 19;
                }
                if (square == 54) {
                    square = square - 35;
                }
                if (square == 90) {
                    square = square - 42;
                }
                if (square == 99) {
                    square = square - 22;
                }
                if (square > 100) {
                    square = square - sum;
                }

                System.out.println("You are now on square " + square);

                if (square == 100) {
                    System.out.println("You Win!");

                    done = true;
                }
            }

        }
    }
}
