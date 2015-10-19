
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

        System.out.print("To start please enter your name: ");
        userName = input.next();
        System.out.println("Welcome to Virtual Snakes and Ladders " + userName + "!");
        System.out.println();
        System.out.println("Lets get Started!!");
        System.out.println("Enter 0 at anytime to quit the game.");

        while (true) {
            System.out.print("Enter the sum of the dice: ");
            int firstNumber = input.nextInt();
            int square = firstNumber + 0;
           
            System.out.println("You are now on square " + square);
            int nextNumber = input.nextInt();
            
            int nextSquare = square + firstNumber;
            
            System.out.println("You are now on square " + nextSquare);
        
        }




    }
}
