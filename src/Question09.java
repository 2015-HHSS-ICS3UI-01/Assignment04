
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class Question09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName;
        String userName2;

        System.out.println("Welcome to Virtual Snakes and Ladders!");
        System.out.println("Lets get Started!!");
        System.out.print("Player One please enter name: ");
        userName = input.next();
        System.out.print("Player Two please enter name: ");
        userName2 = input.next();
        System.out.println("Welcome " + userName + " and " + userName2 + "!");
        System.out.println("Enter 0 at anytime to quit the game.");

        int playerOnePosition = 0;
        int playerTwoPosition = 0;

        while (true) {
            //first users turn    
            //user enters sum of dice
            System.out.print(userName + " enter the sum of the dice: ");
            int firstNumber = input.nextInt();
            //if user enters 0 the they quit
            while (firstNumber > 12 || firstNumber == 1) {
                System.out.print(userName + ", Please enter a number between 2 and 12: ");
                firstNumber = input.nextInt();
            }
            if (firstNumber == 0) {
                System.out.println(userName + " You Quit!");
                System.out.println(userName2 + " Wins!");
                break;
            }//if user doesnt enter a number between 2 and 12 
            //adds position and first number 
            else {
                playerOnePosition = playerOnePosition + firstNumber;
            }
            //ladders 
            int firstLadder = 9 + 25;
            int secondLadder = 40 + 24;
            int thirdLadder = 67 + 19;

            //snakes
            int firstSnake = 54 - 35;
            int secondSnake = 90 - 42;
            int thirdSnake = 99 - 22;

            //user goes up the ladders
            if (playerOnePosition == 9) {
                System.out.println("You are at the bottom of the ladder and you climb up to square "
                        + firstLadder + "!");
                playerOnePosition = firstLadder;
            }
            if (playerOnePosition == 40) {
                System.out.println("You are at the bottom of the ladder and you climb up to square "
                        + secondLadder + "!");
                playerOnePosition = secondLadder;
            }
            if (playerOnePosition == 67) {
                System.out.println("You are at the bottom of the ladder and you climb up to square "
                        + thirdLadder + "!");
                playerOnePosition = thirdLadder;
            }
            //user slides down the snakes
            if (playerOnePosition == 54) {
                System.out.println("You have landed on top of a snake and you slide down to square "
                        + firstSnake + "!");
                playerOnePosition = firstSnake;
            }
            if (playerOnePosition == 90) {
                System.out.println("You have landed on top of a snake and you slide down to square "
                        + secondSnake + "!");
                playerOnePosition = secondSnake;
            }
            if (playerOnePosition == 99) {
                System.out.println("You have landed on top of a snake and you slide down to square "
                        + thirdSnake + "!");
                playerOnePosition = thirdSnake;
            }
            //if position is over 100 than try again
            while (playerOnePosition >= 101) {
                playerOnePosition = playerOnePosition - firstNumber;
                System.out.println("Try Again!");
            }
            //position equals 100 then user wins
            if (playerOnePosition == 100) {
                System.out.println("Congratulations " + userName + ", YOU WIN!!");
                break;
            } else {
                //tells which square the user is on
                System.out.println(userName + " You are now on square " + playerOnePosition);
            }

            //second users turn
            //user enters sum of dice
            System.out.print(userName2 + " enter the sum of the dice: ");
            int secondNumber = input.nextInt();
            //if user doesnt enter a number between 2 and 12
            while (secondNumber > 12 || secondNumber == 1) {
                System.out.print(userName2 + ", Please enter a number between 2 and 12: ");
                secondNumber = input.nextInt();
            }
            //if user enters 0 the they quit
            if (secondNumber == 0) {
                System.out.println(userName2 + " You Quit!");
                System.out.println(userName + " Wins!");
                break;
            } //adds position and first number 
            else {
                playerTwoPosition = playerTwoPosition + secondNumber;
            }

            //user goes up the ladders
            if (playerTwoPosition == 9) {
                System.out.println("You are at the bottom of the ladder and you climb up to square "
                        + firstLadder + "!");
                playerTwoPosition = firstLadder;
            }
            if (playerTwoPosition == 40) {
                System.out.println("You are at the bottom of the ladder and you climb up to square "
                        + secondLadder + "!");
                playerTwoPosition = secondLadder;
            }
            if (playerTwoPosition == 67) {
                System.out.println("You are at the bottom of the ladder and you climb up to square "
                        + thirdLadder + "!");
                playerTwoPosition = thirdLadder;
            }
            //user slides down the snakes
            if (playerTwoPosition == 54) {
                System.out.println("You have landed on top of a snake and you slide down to square "
                        + firstSnake + "!");
                playerTwoPosition = firstSnake;
            }
            if (playerTwoPosition == 90) {
                System.out.println("You have landed on top of a snake and you slide down to square "
                        + secondSnake + "!");
                playerTwoPosition = secondSnake;
            }
            if (playerTwoPosition == 99) {
                System.out.println("You have landed on top of a snake and you slide down to square "
                        + thirdSnake + "!");
                playerTwoPosition = thirdSnake;
            }

            //if position is over 100 than try again
            while (playerTwoPosition >= 101) {
                playerTwoPosition = playerTwoPosition - secondNumber;
                System.out.println("Try Again!");
            }
            //position equals 100 then user wins
            if (playerTwoPosition == 100) {
                System.out.println("Congratulations" + userName2 + ", YOU WIN!!");
                break;
            } else {
                //tells which square the user is on
                System.out.println(userName2 + " You are now on square " + playerTwoPosition);
            }
        }
    }
}
