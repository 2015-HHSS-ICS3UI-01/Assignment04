
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int player1 = 1;
        int player2 = 1;
        int turn = 1;
        while (player1 != 0 || player1 != 100 || player2 != 0 || player2 != 100) {

            while (player1 > 0) {
                turn = turn + 1;
                System.out.println("Player 1's turn");
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
                        } else if (player1 >= 100) {
                            player1 = 100;
                        }
                        System.out.println("You are now on square " + player1);
                    }
                } else if (sum == 0) {
                    System.out.println("You Quit!");
                    System.out.println("Player 2 Win!!!");
                    break;
                }

                break;
            }if (player1 >= 100) {
                System.out.println("Player 1 Win!");
                break;
            }
            


            while (player2 > 0) {
                turn = turn - 1;
                System.out.println("Player 2's turn");
                System.out.println("Enter sum of dice: ");
                int sum1 = input.nextInt();

                if (sum1 != 0) {
                    if (0 > sum1 || 1 == sum1 || sum1 > 12) {
                        System.out.println("You input wrond number!");
                    } else if (2 <= sum1 && sum1 <= 12) {
                        player2 = player2 + sum1;
                        if (player2 == 9) {
                            player2 = player2 + 25;
                        } else if (player2 == 40) {
                            player2 = player2 + 24;
                        } else if (player2 == 67) {
                            player2 = player2 + 19;
                        } else if (player2 == 54) {
                            player1 = player2 - 35;
                        } else if (player2 == 90) {
                            player1 = player2 - 42;
                        } else if (player2 == 99) {
                            player2 = player2 - 22;
                        } else if (player2 >= 100) {
                            player2 = 100;
                        }
                        System.out.println("You are now on square " + player2);
                    }
                } else if (sum1 == 0) {
                    System.out.println("You Quit!");
                    System.out.println("Player 1 Win!!!");
                    break;
                }
                break;


            }
            if (player2 >= 100) {
                System.out.println("Player 2 Win!");
                break;
            } 
        }
    }
}