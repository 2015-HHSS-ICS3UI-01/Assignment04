
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
        //start moves
        System.out.println("Enter sum of dice. ");
        int sum = input.nextInt();
            if (sum >=2 && sum <=12){
                spaces = spaces + sum;
                System.out.println("You are now on " + spaces);
                    if (spaces == 9){
                        System.out.println("You hit a ladder!");
                        spaces = 34;
                    }if (spaces == 40){
                        System.out.println("You hit a ladder!");
                        spaces = 64;
                    }
            }else if (sum == 0){
            System.out.println("You quit!");
            break;
        }
                
        }if (spaces >= 100){
            System.out.println("You win!");
        }  
}}
