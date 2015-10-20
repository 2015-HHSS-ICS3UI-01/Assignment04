
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called "input"
        Scanner input = new Scanner(System.in);
        //makes the computer display the following on the screen
        System.out.println("How much does the food for prom cost?");
        //puts the input from the user into a variable "food"
        int food = input.nextInt();
        //makes the computer display the following on the screen
        System.out.println("How much does the DJ cost?");
        //puts the input from the user into a variable "dj"
        int dj = input.nextInt();
        //makes the computer display the following on the screen
        System.out.println("How much does it cost to rent the hall?");
        //puts the input from the user into a variable "hall"
        int hall = input.nextInt();
        //makes the computer display the following on the screen
        System.out.println("How much do the decorations cost?");
        //puts the input from the user into a variable "dec"
        int dec = input.nextInt();
        //makes the computer display the following on the screen
        System.out.println("How much does it cost for staff?");
        //puts the input from the user into a variable "staff"
        int staff = input.nextInt();
        //makes the computer display the following on the screen
        System.out.println("How much for mixcellaneous costs?");
        //puts the input from the user into a variable "misc"
        int misc = input.nextInt();
        //created a new variable by adding all the other variables
        int cost = (food + dj + hall + dec + staff + misc);
        //created a new variable by dividing "cost" by 35
        int ticket = (cost / 35);
        //makes the computer display the following on the screen
        System.out.println("The total cost is " + cost + ". You will need to sell " + ticket + " tickets to break even");





    }
}
