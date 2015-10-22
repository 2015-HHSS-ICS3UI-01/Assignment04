
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int player = 1;

        //Ask player sum of dice
            while (true) {
                System.out.println("Enter sum of dice:");
                int dice = input.nextInt();

                //Make sure numbers are only between 2 and 12
               if (dice < 2 || dice > 12) {
                    System.out.println("You quit!");
                    break;
                }

                //determining which square player is on
                player = player + dice;

                //if player rolls more than square 100
                if (player > 100) {
                    System.out.println("Try again");
                }

                //if player lands on square 100
                if (player == 100) {
                    System.out.println("You win!");
                    break;
                }

                //Add snakes and ladders to move players if they land on them
                //snakes
                if (player == 54) {
                    player = player - 35;
                } else if (player == 90) {
                    player = player - 42;
                } else if (player == 99) {
                    player = player - 22;
                //ladders
                } else if (player == 9) {
                    player = player + 25;
                } else if (player == 40) {
                    player = player + 24;
                } else if (player == 67) {
                    player = player + 19;
                }

                //indicating what square the player is on
                System.out.println("You are now on square " + player + "");


            }



        }
    }

