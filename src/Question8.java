
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godie2014
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);  
        int roll= 0;
        int place = 0;
        
        
        while (true) {
            if (place != 100) {
                System.out.println("Enter sum of dice");
            }
            if (roll < 2 || roll > 12) {
                System.out.println("You Quit");
                break;}

                //snakes
                if (place + roll == 54) {
                    place = 19;
                }

                if (place + roll == 90) {
                    place = 48;
                }

                if (place + roll == 99) {
                    place = 77;
                }

                //ladders
                if (place + roll == 9) {
                    place = 34;
                }

                if (place + roll == 40) {
                    place = 64;
                }
                if (place + roll == 67) {
                    place = 99;
                }

                int move = place + roll;
              
                
                
                {

                }
                  
            }

        }

    }



    

