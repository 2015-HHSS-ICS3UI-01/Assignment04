
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Space is equal to 1
        double space = 1;
        while(true){
        //asks to input the dice number
        System.out.print("Enter sum of dice: ");
        double diceSum = input.nextInt();
        //if the dice sum is equal to 2 through 12, it will move you and show what space you're on
        if (diceSum >= 2 && diceSum <= 12)
        {
            space = space + diceSum;
            System.out.println("You are now on square " + space);
        }
        
        if (diceSum <= 2)
        //if you input less than 2, it will stop the program
        {
            System.out.println("You Quit!");
            break;
        }
        //if you input more than 12, it wont make you go forward
        else if (diceSum > 12 && space > 100)
        {
            space = space + diceSum - diceSum;
            System.out.println("You are now on square " + space);
        }
        //if you are on space 100, the game will end and you win
        if(space == 100)
        {
            System.out.println("You Win!");
            break;
        }
        //if you end up on space 54, you will go down to space 19
        if(space == 54)
        {
            space = 19;
            System.out.println("You slid down a snake and are now on square " + space);
        }
        //if you end up on space 90, you will go down to space 48
        if(space == 90)
        {
            space = 48;
            System.out.println("You slid down a snake and are now on square " + space);
        }
        //if you end up on space 99, you will go down to space 77
        if(space == 99)
        {
            space = 77;
            System.out.println("You slid down a snake and are now on square " + space);
        }
        //if you end up on space 9, you will go up to space 34
        if(space == 9)
        {
            space = 34;
            System.out.println("You up a ladder and are now on square " + space);
        }
        //if you end up on space 40, you will go up to space 64
        if(space == 40)
        {
            space = 64;
            System.out.println("You up a ladder and are now on square " + space);
        }
        //if you end up on space 67, you will go up to space 86
        if(space == 67)
        {
            space = 86;
            System.out.println("You up a ladder and are now on square " + space);
        }
      }    
   }
}
