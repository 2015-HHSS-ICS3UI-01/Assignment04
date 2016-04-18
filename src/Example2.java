/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        //Generate random number fromm 1 to 100
        int number = (int) (Math.random() *100 + 1);

        //keep track if game is over
        boolean done = false;
        while (!done) {
            //get the user's guess
            System.out.println("Please guess a number between 1 and 100");
            int guess = input.nextInt();
            
            if (guess > number) {
                System.out.println("Too High");
                
            } //Guess is too low
            
             else if (guess < number) {
                System.out.println("Too Low");
                
            } else {
               
                System.out.println("Good Job");
                done = true;
            }
        }
    }
}
