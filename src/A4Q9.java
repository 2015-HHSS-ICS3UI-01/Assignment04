/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int square = 1;
        int square2 = 1;

        while (true) {

            if (square < 100) {

                System.out.println("Enter the total number on the dice, Player 1");
                int dice = input.nextInt();

                if (dice + square > 100) {

                    System.out.println("Your number goes beyond the limit of 100 and are now on " + square);
                } else {

                    square = dice + square;

                    System.out.println("You are now on " + square + " Player 1");
                }

                if (square == 9) {

                    square = 34;

                    System.out.println("You have climed a ladder and are now on " + square + " Player 1");

                } else if (square == 40) {

                    square = 64;

                    System.out.println("You have climed a ladder and are now on " + square + " Player 1");

                } else if (square == 67) {

                    square = 86;

                    System.out.println("You have climed a ladder and are now on " + square + " Player 1");

                } else if (square == 54) {

                    square = 19;

                    System.out.println("You landed on a snake and are now on " + square + " Player 1");

                } else if (square == 90) {

                    square = 48;

                    System.out.println("You landed on a snake and are now on " + square + " Player 1");

                } else if (square == 99) {

                    square = 77;

                    System.out.println("You have landed on a snake and are now on " + square + " Player 1");

                } else if (square == 100) {

                    System.out.println("Congratulations, You have Won, Player 1! ");

                    break;
                }
            }

            if (square2 < 100) {

                System.out.println("Enter the total number on the dice, Player 2");
                int dice = input.nextInt();

                if (dice + square2 > 100) {

                    System.out.println("Your number goes beyond the limit of 100 and are now on " + square + " Player 2");
                } else {

                    square2 = dice + square2;

                    System.out.println("You are now on " + square2 + " Player 2");
                }

                if (square == 9) {

                    square = 34;

                    System.out.println("You have climed a ladder and are now on " + square2 + " Player 2");

                } else if (square2 == 40) {

                    square2 = 64;

                    System.out.println("You have climed a ladder and are now on " + square2 + " Player 2");

                } else if (square2 == 67) {

                    square2 = 86;

                    System.out.println("You have climed a ladder and are now on " + square2 + " Player 2");

                } else if (square2 == 54) {

                    square2 = 19;

                    System.out.println("You landed on a snake and are now on " + square2 + " Player 2");

                } else if (square2 == 90) {

                    square2 = 48;

                    System.out.println("You landed on a snake and are now on " + square2 + " Player 2");

                } else if (square2 == 99) {

                    square2 = 77;

                    System.out.println("You have landed on a snake and are now on " + square2 + " Player 2");

                } else if (square2 == 100) {

                    System.out.println("Congratulations, You have Won, Player 2! ");

                    break;
                }
            }
        }
    }
}