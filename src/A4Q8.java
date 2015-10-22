
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make scanner
        Scanner input = new Scanner (System.in);
        
        //make variable for spaces moved
        int spaces = 1;
        while (spaces <= 100){
            
        //start rolls
        System.out.println("Enter sum of dice. ");
        int sum = input.nextInt();
        
        //if user rolls between 2 and 12
            if (sum >=2 && sum <=12){
                spaces = spaces + sum;
                System.out.println("You are now on " + spaces);
                
                //if user lands on a ladder
                    if (spaces == 9){
                        System.out.println("You hit a ladder!");
                        spaces = 34;
                        System.out.println("You are now on " + spaces);
                    }if (spaces == 40){
                        System.out.println("You hit a ladder!");
                        spaces = 64;
                        System.out.println("You are now on " + spaces);
                    }if (spaces == 67){
                        System.out.println("You hit a ladder! ");
                        spaces = 86;
                        System.out.println("You are now on " + spaces);
                        
                //if user lands on a snake
                    }if (spaces == 54){
                        System.out.println("You hit a snake!");
                        spaces = 19;
                        System.out.println("You are now on " + spaces);
                    }if (spaces == 90){
                        System.out.println("You hit a snake!");
                        spaces = 48;
                        System.out.println("You are now on " + spaces);
                    }if (spaces == 99){
                        System.out.println("You hit a snake!");
                        spaces = 77;
                        System.out.println("You are now on " + spaces);
                    }
        //if user wants to quit            
            }else if (sum == 0){
            System.out.println("You quit!");
            break;
        }
       //if user wins        
        }if (spaces >= 100){
            System.out.println("You win!");
        }
       //close game
        input.close();
        }
    }
