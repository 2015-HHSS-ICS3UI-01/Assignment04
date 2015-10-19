
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matt
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner for user input
        Scanner input = new Scanner(System.in);
        //create int "square" to store user's square value
        int square = 0;
        //while true statement surrounding fundamental gameplay dynamics
        while (true) {
            //sout for user prompt
            System.out.println("Please input roll");
            //int roll to store roll information
            int roll = input.nextInt();
            //update user square position based on roll value
            square = square + roll;
            //snakes & ladders
            if (square == 9) {
                square = 34;
            }
            if (square == 40) {
                square = 64;
            }
            if (square == 67) {
                square = 86;
            }
            if (square == 54) {
                square = 19;
            }
            if (square == 90) {
                square = 48;
            }
            if (square == 99) {
                square = 77;
                //if the user gets to square 100, he wins, and while statement breaks
            }
            if (square == 100) {
                System.out.println("You win!");
                break;
            }
            //tells user what his/her current square value is
            System.out.println("Your square is " + square);

        }
    }

}
