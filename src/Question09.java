
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
        System.out.println("Welcome " + userName + " " + "and " + userName2 + "!");     
        System.out.println("Enter 0 at anytime to quit the game.");

        int playerOnePosition = 0;
        int plaerTwoPosition = 0;
    
    
    
    }
}
