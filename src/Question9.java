
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
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner for user input
        Scanner input = new Scanner(System.in);
        //learn player's names
        System.out.println("Please enter player 1's name.");
        String player1 = input.nextLine();
        System.out.println("Please enter player 2's name.");
        String player2 = input.nextLine();
        //create int "square" to store user's square value
        int squarePlayer1 = 0;
        int squarePlayer2 = 0;
        //while true statement surrounding fundamental gameplay dynamics
        while (true) {
            //sout for user prompt
            System.out.println(player1 + "'s roll?");
            //int roll to store roll information
            int rollPlayer1 = input.nextInt();
            System.out.println(player2 + "'s roll?");
            int rollPlayer2 = input.nextInt();
            //update user square position based on roll value
            squarePlayer1 = squarePlayer1 + rollPlayer1;
            squarePlayer2 = squarePlayer2 + rollPlayer2;
            //snakes & ladders
            if (squarePlayer1 == 9) {
                squarePlayer1 = 34;
            }
            if (squarePlayer2 == 9) {
                squarePlayer2 = 34;
            }
            if (squarePlayer1 == 40) {
                squarePlayer1 = 64;
            }
            if (squarePlayer2 == 40) {
                squarePlayer2 = 64;
            }
            if (squarePlayer1 == 67) {
                squarePlayer1 = 86;
            }
            if (squarePlayer2 == 67) {
                squarePlayer2 = 86;
            }
            if (squarePlayer1 == 54) {
                squarePlayer1 = 19;
            }
            if (squarePlayer2 == 54) {
                squarePlayer2 = 19;
            }
            if (squarePlayer1 == 90) {
                squarePlayer1 = 48;
            }
            if (squarePlayer2 == 90) {
                squarePlayer2 = 48;
            }
            if (squarePlayer1 == 99) {
                squarePlayer1 = 77;
            }
            if (squarePlayer2 == 99) {
                squarePlayer2 = 77;
            //if the user gets to square 100, he wins, and while statement breaks
            }
            if (squarePlayer1 == 100) {
                System.out.println(player1 + " wins!");
                break;
            }if(squarePlayer2 == 100){
                System.out.println(player2 + " wins!");
                break;
            }
            //tells user what his/her current square value is
            System.out.println(player1 + "'s square is " + squarePlayer1);
            System.out.println(player2 + "'s square is " + squarePlayer2);
        
    


        }
    }

}
