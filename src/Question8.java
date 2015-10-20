
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//created a new scanner called "input"
        Scanner input = new Scanner(System.in);

//created a new variable called "space" and made it equal to 1
        int space = 1;
        //the following commands will always be executed
        while (true) {
            //makes the computer display the following on the screen
            System.out.println("Enter sum of dice:");
            //puts the input from the user into a variable "diceroll"
            int diceroll = input.nextInt();
            //"space" is now equal to itself plus "diceroll"
            space = (space + diceroll);

//if diceroll is less than or equal to 1, the following commands will be executed
            if (diceroll <= 1) {
                //makes the computer display the following on the screen
                System.out.println("You Quit!");
                //breaks the program out of the while loop
                break;
            }
            //if diceroll is more than or equal to 13, the following commands will be executed
            if (diceroll >= 13) {
                //makes the computer display the following on the screen
                System.out.println("You Quit!");
                //breaks the program out of the while loop
                break;
            }
            //if diceroll is less than or equal to 12, more than or equal to 2, 
            //and if space is less than or equal to 100 the following commands will be executed
            if (diceroll >= 2) {
                if (diceroll <= 12) {
                    if (space <= 100) {
                        //makes the computer display the following on the screen
                        System.out.println("You are now on square " + space);
                    }

                }
            }
            //if space is equal to 9, the following commands will be executed
            if (space == 9) {
                space = 34;
            }
            //if space is equal to 40, the following commands will be executed
            if (space == 40) {
                space = 64;
            }
            //if space is equal to 67, the following commands will be executed
            if (space == 67) {
                space = 86;
            }
            //if space is equal to 54, the following commands will be executed
            if (space == 54) {
                space = 19;
            }
            //if space is equal to 90, the following commands will be executed
            if (space == 90) {
                space = 48;
            }
            //if space is equal to 99, the following commands will be executed
            if (space == 99) {
                space = 77;
            }
            //if space is equal to 100, the following commands will be executed
            if (space == 100) {
                //makes the computer display the following on the screen
                System.out.println("You Win!");
                //breaks the program out of the while loop
                break;
            }





        }
    }
}
