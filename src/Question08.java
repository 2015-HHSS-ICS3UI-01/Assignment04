
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class Question08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName;

        //asks user to enter name in order to start the game (welcome screen)
        System.out.print("To start please enter your name: ");
        userName = input.next();
        System.out.println("Welcome to Virtual Snakes and Ladders " + userName + "!");
        System.out.println("Lets get Started!!");
        System.out.println("Enter 0 at anytime to quit the game.");

        int position = 0;

        while (true) {
            //user enters sum of dice
            System.out.print("Enter the sum of the dice: ");
            int firstNumber = input.nextInt();

            if (firstNumber == 0) {
                System.out.println("You Quit!");
                break;
            } else if (firstNumber > 12 || firstNumber == 1) {
                System.out.println("Please enter a number between 2 and 12");
            } else if (position == 100) {
                System.out.println("Congratulations, YOU WIN!!");
                break;
            } else {
                position = position + firstNumber;
            }
            
           
            /*
             while (position + firstNumber > 101) {
             //position = position - firstNumber;
             System.out.println("Try Again!");
             System.out.println("You are now on square " + position);
             System.out.print("Enter the sum of the dice: ");
             firstNumber = input.nextInt();
             }
             */
            //ladders 
            int firstLadder = 9 + 25;
            int secondLadder = 40 + 24;
            int thirdLadder = 67 + 19;

            //snakes
            int firstSnake = 54 - 35;
            int secondSnake = 90 - 42;
            int thirdSnake = 99 - 22;

            //user goes up the ladders
            if (position == 9) {
                System.out.println("You are at the bottom of the ladder and you climb up to square "
                        + firstLadder + "!");
                position = firstLadder;
            }
            if (position == 40) {
                System.out.println("You are at the bottom of the ladder and you climb up to square "
                        + secondLadder + "!");
                position = secondLadder;
            }
            if (position == 67) {
                System.out.println("You are at the bottom of the ladder and you climb up to square "
                        + thirdLadder + "!");
                position = thirdLadder;
            }
            //user slides down the snakes
            if (position == 54) {
                System.out.println("You have landed on top of a snake and you slide down to square "
                        + firstSnake + "!");
                position = firstSnake;
            }
            if (position == 90) {
                System.out.println("You have landed on top of a snake and you slide down to square "
                        + secondSnake + "!");
                position = secondSnake;
            }
            if (position == 99) {
                System.out.println("You have landed on top of a snake and you slide down to square "
                        + thirdSnake + "!");
                position = thirdSnake;
            }

            //tells which square the user is on
            System.out.println("You are now on square " + position);
 
            
        }

    }
}
