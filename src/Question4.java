
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // create scanner to fetch info
        //  food, DJ, the hall rental, the decorations, the wait staff, and any miscellaneous expenses
        System.out.println("Hi there, answer the following questions on seperate lines and I will calculate the amount of tickets that need to be sold to break even.");
        System.out.println("What is the expense of the food at the prom?");
        int food = input.nextInt();
        //ask for the cost of food and store it
        System.out.println("What is the expense of the DJ at the prom?");
        int dj = input.nextInt();
        //ask for the cost of DJ and store it
        System.out.println("What is the expense of the hall rental at the prom?");
        int hall = input.nextInt();
        //ask for the cost of hall and store it
        System.out.println("What is the expense of the decorations at the prom?");
        int decorations = input.nextInt();
        //ask for the cost of decorations and store it
        System.out.println("What is the expense of the wait staff at the prom?");
        int staff = input.nextInt();
        //ask for the cost of staff and store it
        System.out.println("What is the expense of any miscellaneous expenses at the prom?");
        int misc = input.nextInt();
        //ask for the cost of misc and store it
        int total = (food + dj + hall + decorations + staff + misc);
        double people = (food + dj + hall + decorations + staff + misc) / 35.0;
        people = Math.ceil(people);
        //calculate amount of tickets that must be sold and round up
        System.out.println("The total cost of prom will be $" + total + ". You will need to sell " + people + " tickets to break even.");
        // output answer
    }
}
