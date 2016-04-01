
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int player1 = 1;
        while (player1 > 0) {
            System.out.println("Enter sum of dice: ");
            int sum = input.nextInt();

            if (sum != 0) {
                if (0 > sum || 1 == sum || sum > 12) {
                    System.out.println("You input wrond number!");
                } else if (2 <= sum && sum <= 12) {
                    player1 = player1 + sum;
                    if (player1 == 9) {
                        player1 = player1 + 25;
                    } else if (player1 == 40) {
                        player1 = player1 + 24;
                    } else if (player1 == 67) {
                        player1 = player1 + 19;
                    } else if (player1 == 54) {
                        player1 = player1 - 35;
                    } else if (player1 == 90) {
                        player1 = player1 - 42;
                    } else if (player1 == 99) {
                        player1 = player1 - 22;
                    }else if (player1 >=100){
                        player1 = 100;
                    }
                    System.out.println("You are now on square " + player1);
                }
            } else if (sum == 0) {
                System.out.println("You Quit!");
                break;
            }
            if (player1 >= 100) {
                System.out.println("You Win!");
            }
        }
    }
}
