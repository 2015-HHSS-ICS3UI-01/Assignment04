
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);

        //where is the game peice
        int place = 1;

        while (place != 100){
        //roll dice
        System.out.println("Enter sum of dice: ");
        int roll = input.nextInt();
        
        //move peice
        int moveAmount = place + roll;
        System.out.println("You are now on square  " + moveAmount);
        } 
        if(place == 100){
            System.out.println("You win!");
        }




    }
}
