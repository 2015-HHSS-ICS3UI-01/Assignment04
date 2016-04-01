
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sum of dice"); 
        int location = input.nextInt();
        int one = (int)(location + 1);
        
        System.out.println("You are now on square " + one);
        
        System.out.println("Enter sum of dice");
        //int two = (int)(location + 1);
        System.out.println("You are now on square " + two);
        
        System.out.println("Enter sum of dice");
 
        if (location == 54) {
            location = 19;
            System.out.println("You've been eaten by a snake! Yikes! You've descended to square 19");
        } else if (location == 90) {
            location = 48;
            System.out.println("You've been eaten by a snake! Yikes! You've descended to square 48");
        } else if (location == 99) {
            location = 77;
            System.out.println("You've been eaten by a snake! Yikes! You've descended to square 77");
        }
        
        if (location == 9) {
            location = 34;
            System.out.println("You've climbed a ladder! You have landed on square 34");
        } else if (location == 40) {
            location = 64;
            System.out.println("You've climbed a ladder! You have landed on square 64");
        } else if (location == 67) {
            location = 86;
            System.out.println("You've climbed a ladder! You have landed on square 86");
        }

        if (location == 100){
            System.out.println("Congradulations! You have won!");
        }
    }
}
