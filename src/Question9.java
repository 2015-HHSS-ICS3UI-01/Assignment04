
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int square = 1;
        int square2 = 1;
        boolean done = false;
        while (!done) {

            System.out.println("Player 1 enter sum of dice:");
            int sum1 = input.nextInt();

            if (sum1 < 2 || sum1 > 12) {
                System.out.println("You Quit!");
                done = true;
            } else if (sum1 >= 2 && sum1 <= 12) {
                square = square + sum1;


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
                    square = square - sum1;
                }

                System.out.println("Player 1 is now on square " + square);
                System.out.println(" ");



                System.out.println("Player 2 enter sum of dice:");
                int sum2 = input.nextInt();

                if (sum2 < 2 || sum2 > 12) {
                    System.out.println("You Quit!");
                    done = true;
                } else if (sum2 >= 2 && sum2 <= 12) {
                    square2 = square2 + sum2;


                    if (square2 == 9) {
                        square2 = square2 + 25;
                    }
                    if (square2 == 40) {
                        square2 = square2 + 24;
                    }
                    if (square2 == 67) {
                        square2 = square2 + 19;
                    }
                    if (square2 == 54) {
                        square2 = square2 - 35;
                    }
                    if (square2 == 90) {
                        square2 = square2 - 42;
                    }
                    if (square2 == 99) {
                        square2 = square2 - 22;
                    }
                    if (square2 > 100) {
                        square2 = square2 - sum2;
                    }

                    System.out.println("Player 2 is now on square " + square2);
                    System.out.println(" ");

                    if (square == 100) {
                        System.out.println("Player 1 Wins!");
                    }
                    if (square2 == 100) {
                        System.out.println("Player 2 Wins!");

                        done = true;
                    }


                }
            }
        }
    }
}
