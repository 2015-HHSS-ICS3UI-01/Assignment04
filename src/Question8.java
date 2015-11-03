
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// create scanner
        Scanner input = new Scanner(System.in);
//define position as starting space
        int position = 1;

//loop until position is 100
        while (position <= 99) {
//request user to input dice roll, store in variable "roll"            
            System.out.println("Enter dice roll: ");
            int roll = input.nextInt();
//check if roll is between 1 and 12, if not, end program            
            if (roll < 2 || roll > 12) {
                System.out.println("You quit, game over!");
                System.exit(0);
            } else {
//add roll to position                
                position = (roll + position);
            }

//many checks checking if the position of player is on a snake or ladder, and resulting in advancing the player or putting player behind
            if (position == 9) {
                position = 34;
                System.out.println("You landed on a ladder and are now on square 34!");
            } else if (position == 40) {
                position = 64;
                System.out.println("You landed on a ladder and are now on square 64!");
            } else if (position == 54) {
                position = 19;
                System.out.println("You landed on a snake and are now on square 19!");
            } else if (position == 90) {
                position = 48;
                System.out.println("You landed on a snake and are now on square 48!");
            } else if (position == 99) {
                position = 77;
                System.out.println("You landed on a snake and are now on square 77!");
            } else if (position == 67) {
                position = 86;
                System.out.println("You landed on a ladder and are now on square 86");
            } else {
//display position                
                System.out.println("You are now on square " + position);
            }
        }
//after loop ends, (because postion is greater than or egual to 100), display to user that they won        
        System.out.println("You've reached square 100-->YOU WIN!");
    }
}
