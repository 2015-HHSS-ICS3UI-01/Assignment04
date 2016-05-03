
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class Example02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int Number = (int) (Math.random()*100 + 1);
        //Keep track of whether game is over
        boolean done = false;
        while(!done){
            //Get user's guess
            System.out.println("Please guess a number");
            int guess = input.nextInt();
            
            //guess is too high
            if(guess > Number){
                System.out.println("Too high");
            }//guess is too low
            else if(guess < Number){
                System.out.println("Too low");
                }//Anser is correct
            else if(guess == Number){
                System.out.println("Congrats you won, now go get a life");
            }                 
        }
    }
}
